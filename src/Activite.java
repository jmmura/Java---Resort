import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Activite {

    public static Map<String,Activite> listeActivites = new HashMap<>();

    private String nom;
    private String type;

    private double prix;

    public static double recettes;

    private int recette;
    private Set<Personne> membres = new HashSet<>();
    private Set<Horaire> horaires = new TreeSet<>();


    public Activite(String Nom,String Type,Horaire h, double Prix){
        nom=Nom;
        this.prix=Prix;
        type = Type;
        Set<Horaire> hor = new TreeSet<>();
        hor.add(h);
        this.horaires.add(h);
        listeActivites.put(Nom,this);
    }

    public static void setHoraire(String activite, Horaire h){
                listeActivites.get(activite).getHoraires().add(h);
    }




    public static void setMembres(String nomActivite, Personne p){
         listeActivites.get(nomActivite).setMembres(p);
    }


    public void setMembres(Personne p){
        if(membres == null){membres = new HashSet<>();}
        membres.add(p);
    }

    public String getNom(){
        return nom;
    }

    public Set<Horaire> getHoraires(){
        return this.horaires;
    }
    public Set<Personne> getMembres(){
        return this.membres;
    }

    public double getPrix() {
        return prix;
    }

    public static void afficheActivites(){
        for(Activite a : listeActivites.values()){
            System.out.print(a.getNom()+" ");
        }
        System.out.println();
    }

    public static void afficherProgramme(){
        for(Activite a : listeActivites.values()){
            System.out.print(a.getNom()+" ");
            System.out.println(a.getHoraires());
        }
    }



    public static void afficherMembres(){
        for(Activite a : listeActivites.values()){
            System.out.print(a.getNom()+" : ");
            for(Personne p : a.getMembres()){
                System.out.print(p.getNom()+" ");
            }
            System.out.println();
        }
    }

}
