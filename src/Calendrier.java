import java.util.*;


public class Calendrier {




    private String[][] cal = new String[13][7]; // 7 jours de 7h à 19h

    public String[][] getCalendrier() {
        return cal;
    }

    public void remplirCalendrier(){
        for(Activite act : Activite.listeActivites.values()){
            for(Horaire h : act.getHoraires()){
                for(int i=7;i<=19;i++){
                    if(i>=h.getDebut().getHour() && i<=h.getFin().getHour()){
                        int ligne = i-7;
                        int colonne = Semaine.valueOf(String.valueOf(h.getJour())).ordinal();
                        if(cal[ligne][colonne]==null){cal[ligne][colonne]= act.getNom();}
                        else{cal[ligne][colonne]+= act.getNom();}
                    }
                }
            }
        }
    }

    public void afficheCalendrier(){
        String alignement = "| %-6s | %-7s | %-10s | %-7s | %-10s | %-8s | %-10s |%n";


        System.out.format("+-------+-------+----------+-------+----------+--------+----------+%n");
        System.out.format("| Lundi | Mardi | Mercredi | Jeudi | Vendredi | Samedi | Dimanche |%n");
        System.out.format("+-------+-------+----------+-------+----------+--------+----------+%n");
        for (int i = 0; i < 13; i++) {
            System.out.format(alignement, cal[i][0],cal[i][1],cal[i][2],cal[i][3],cal[i][4],cal[i][5],cal[i][6]);
        }
        System.out.format("+-------+-------+----------+-------+----------+--------+----------+%n");
        System.out.println();
    }

}
