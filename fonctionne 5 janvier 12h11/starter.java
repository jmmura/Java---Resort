import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class starter {

    public static void init(){
        int choice = 0;
        while(choice!=4){
            System.out.println("1. Ajouter activité");
            System.out.println("2. Ajouter Personne");
            System.out.println("3. Supprimer personne");
            System.out.println("4. Exit");
            Scanner x = new Scanner(System.in);
            choice = x.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Entrer type: stage/repas/logement");
                    Scanner t = new Scanner(System.in);
                    String type = t.nextLine();
                    System.out.println("Entrer le nom de l'activité, jour; l'heure de debut et l'heure de fin et le prix 'nom,jour,debut,fin,prix'");
                    String[] act = t.nextLine().split(",",0);
                    Horaire h = new Horaire(LocalTime.of(Integer.parseInt(act[2]),0),LocalTime.of(Integer.parseInt(act[3]),0),Semaine.valueOf(act[1]));
                    if(Activite.listeActivites.get(act[0])==null){
                        new Activite(act[0],type,h,Double.parseDouble(act[4]));
                    }
                    else{
                        Activite.setHoraire(act[0],h);
                    }
                    break;
                case 2:
                    System.out.println("Entrer nom: ");
                    Scanner sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    Personne p = new Personne(s);
                    Activite.afficherProgramme();
                    System.out.println("A quelles activité voulez-vous vous inscrire?");
                    Activite.afficheActivites();
                    String[] choix = sc.nextLine().split(",",0);
                    for(String str : choix){
                        p.inscription(str);
                    }
                    System.out.println("Membres par activité: ");
                    Activite.afficherMembres();
                    Personne.listerGens();
                    break;
                case 3:
                    System.out.println("nom de la personne: ");
                    Scanner su = new Scanner(System.in);
                    String supp = su.nextLine();
                    if(Personne.gens.get(supp)!=null) {
                        System.out.println("avant");
                        Personne.listerGens();
                        System.out.println("après");
                        Personne.deletePersonne(supp);
                        Personne.listerGens();
                    }
                    break;
                case 4:
                    System.out.println("ciao");
                    break;
                default: continue;
            }
            System.out.println();
        }
    }

}
