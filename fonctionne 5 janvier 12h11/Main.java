import java.sql.SQLOutput;
import java.util.*;
import java.time.*;
import java.lang.*;



public class Main {

    public static void main(String[] args) {


        Stage stage1 = new Stage("stage1","stage",new Horaire(LocalTime.of(1,0),LocalTime.of(2,0),Semaine.lundi),50);
        Stage stage2 = new Stage("stage2","stage",new Horaire(LocalTime.of(3,0),LocalTime.of(4,0), Semaine.mardi),30);
        Repas repas1 = new Repas("repas1","repas",new Horaire(LocalTime.of(5,0),LocalTime.of(6,0),Semaine.mardi),40);
        Stage stage4 = new Stage("stage4","stage",new Horaire(LocalTime.of(10,10),LocalTime.of(11,0),Semaine.mercredi),30);
        new Activite("stage2","repas", new Horaire(LocalTime.of(2,0),LocalTime.of(3,0),Semaine.vendredi),20);

        //starter.init();

        Personne p1 = new Personne("personne1");
        p1.inscription("stage1");
        p1.inscription("stage2");
        Activite.afficheActivites();
        System.out.println("liste stages inscrits: ");
        p1.listeInscriptions();
        System.out.println();
        System.out.println("Suppression stage1");
        Activite.listeActivites.remove("stage1");
        Activite.afficheActivites();
        System.out.println("Liste inscriptions");
        p1.listeInscriptions();




    }

    /*String format = """
                   +---+---+---+---+---+---+---+
                   | * | * | * | * | * | * | * |
                   +---+---+---+---+---+---+---+
                8h | . | . | . | . | . | . | . |
                9h | . | . | . | . | . | . | . |
                10h| . | . | . | . | . | . | . |
                   +---+---+---+---+---+---+---+

                """.replaceAll("\\*","%s");
        System.out.printf(format, Semaine.values());*/
}