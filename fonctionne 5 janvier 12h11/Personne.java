import java.util.*;

public class Personne {

    public static Map<String,Personne> gens = new HashMap<>();
    private int id;
    private String nom;
    private String statut;
    private double depenses;


    private List<Activite> inscriptions = new LinkedList<>();
    private HorairePerso horaire;



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
        inscriptions.add(Activite.listeActivites.get(nomActivite));
        updateDepenses();
    }

    public String getNom() {
        return nom;
    }
    public String getStatut() {return statut;}

    public double getDepenses() {
        return depenses;
    }

    public List<Activite> getInscriptions() {
        return inscriptions;
    }

    public int getId(){return id;}

    public int setId(String nom){
        int x=0;
        for(int i=0;i<nom.length();i++){x+=Character.valueOf(nom.charAt(i));}
        return x;
    }

    public void updateDepenses(){
        for(Activite a : inscriptions){
            depenses+=a.getPrix()*(statut == "statut1" ? 0.5 : 1.5); //MOMENTANÉ
        }
    }
    public static void listerGens(){
        for(String s : gens.keySet()){
            System.out.print(gens.get(s).getNom()+" ");
        }
    }

    public static void deletePersonne(String nomPers){
        gens.remove(nomPers);
    }

    public void listeInscriptions(){
        for(Activite a : inscriptions){
            System.out.print(a.getNom()+" ");
        }
        //System.out.println(inscriptions.size());
    }

//    @Override
//    public int compareTo(Personne o) {
//        int result = this.nom.compareTo(o.nom);
//        if(result==0){
//            result=this.debut.compareTo(o.debut);
//        }
//        return result;
//    }


}
