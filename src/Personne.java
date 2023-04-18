import java.util.*;

public class Personne {

    public static Map<String,Personne> gens = new HashMap<>();
    private int id;
    private String nom;
    private String statut;
    private double depenses;

    public Personne(String n,String s){
        nom=n;
        statut=s;
        gens.put(n,this);
        id = setId(n);
    }

    public Personne(String Nom){
        nom=Nom;
        gens.put(Nom,this);
        id = setId(Nom);
    }

    public void inscription(String nomActivite){
        Activite.setMembres(nomActivite,this);
        updateDepenses();
    }

    public String getNom() {
        return nom;
    }
    public String getStatut() {return statut;}

    public double getDepenses() {
        return depenses;
    }

    public List<Activite> getInscriptions() {   //liste d'activités auxquelles la Personne est inscrite, obtenue en parcourant la map d'Activite
        List<Activite> inscriptions = new ArrayList<>();
        for(Activite a : Activite.listeActivites.values()){
            if(a.getMembres().contains(this)){
                inscriptions.add(a);
            }
        }
        return inscriptions;
    }

    public int getId(){return id;}

    public int setId(String nom){
        int x=0;
        for(int i=0;i<nom.length();i++){x+=Character.valueOf(nom.charAt(i));}
        return x;
    }

    public void updateDepenses(){
        for(Activite a : getInscriptions()){
            depenses+=a.getPrix()*(statut == "statut1" ? 0.5 : 1.5); //MOMENTANÉ
        }
    }
    public static void listerGens(){
        for(String s : gens.keySet()){
            System.out.print(gens.get(s).getNom()+" ");
        }
        System.out.println();
    }

    public static void deletePersonne(String nomPers){
        Personne p = gens.get(nomPers);
        gens.remove(nomPers);
        for(Activite a : Activite.listeActivites.values()){
            if(a.getMembres().contains(p)){a.getMembres().remove(p);}
        }
    }

    public void listeInscriptions(){
        for(Activite a : getInscriptions()){
            System.out.print(a.getNom()+" ");
        }

    }

    public void listeToutesInscriptions(){
        for(Personne p : gens.values()){
            System.out.print(p.getNom()+" : ");
            p.listeInscriptions();
            System.out.print(p.getDepenses());
            System.out.println();
        }
    }


}
