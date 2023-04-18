import java.sql.SQLOutput;
import java.util.*;
import java.time.*;
import java.lang.*;
import javax.swing.*;



public class Main {

    public static void main(String[] args) {


        Stage stage1 = new Stage("stage1","stage",new Horaire(LocalTime.of(10,0),LocalTime.of(11,0),Semaine.lundi),50);
        Stage stage2 = new Stage("stage2","stage",new Horaire(LocalTime.of(13,0),LocalTime.of(14,0), Semaine.mardi),30);
        Repas repas1 = new Repas("repas1","repas",new Horaire(LocalTime.of(17,0),LocalTime.of(19,0),Semaine.mardi),40);
        Stage stage4 = new Stage("stage4","stage",new Horaire(LocalTime.of(10,10),LocalTime.of(11,0),Semaine.mercredi),30);
        new Activite("stage2","repas", new Horaire(LocalTime.of(9,0),LocalTime.of(10,0),Semaine.vendredi),20);

        starter.init();

//        String leftAlignFormat = "| %-15s | %-4d |%n";
//
//        System.out.format("+-----------------+------+%n");
//        System.out.format("| Column name     | ID   |%n");
//        System.out.format("+-----------------+------+%n");
//        for (int i = 0; i < 5; i++) {
//            System.out.format(leftAlignFormat, "some data" + i, i * i);
//        }
//        System.out.format("+-----------------+------+%n");



//        Personne p1 = new Personne("personne1");
//        p1.inscription("stage1");
//        p1.inscription("stage2");
//        Activite.afficherProgramme();
//        System.out.println(Semaine.values());
//        Calendrier c = new Calendrier();
//        c.remplirCalendrier();
//        c.afficheCalendrier();
//
//        String leftAlignFormat = "| %-6s | %-7s | %-10s | %-7s | %-10s | %-8s | %-10s |%n";
//
//
//        System.out.format("+-------+-------+----------+-------+----------+--------+----------+%n");
//        System.out.format("| Lundi | Mardi | Mercredi | Jeudi | Vendredi | Samedi | Dimanche |%n");
//        System.out.format("+-------+-------+----------+-------+----------+--------+----------+%n");
//        String[][] test = c.getCalendrier();
//        for (int i = 0; i < 13; i++) {
//            //String ligne = String.format(leftAlignFormat, test[i][0],test[i][1],test[i][2],test[i][3],test[i][4],test[i][5],test[i][6]).replace("null"," ");
//            System.out.format(leftAlignFormat, test[i][0],test[i][1],test[i][2],test[i][3],test[i][4],test[i][5],test[i][6]);
//            //System.out.print(ligne);
//        }
//        System.out.format("+-------+-------+----------+-------+----------+--------+----------+%n");
//        System.out.println();
//
//
//
//
//
//
//        System.out.println("liste stages inscrits: ");
//        p1.listeInscriptions();
//        System.out.println("Suppression stage1");
//        Activite.listeActivites.remove("stage1");
//        Activite.afficheActivites();
//        System.out.println("Liste inscriptions");
//        p1.listeInscriptions();




    }
}