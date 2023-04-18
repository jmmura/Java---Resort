
import java.time.LocalTime;

public class Horaire implements Comparable<Horaire>{
    private LocalTime debut;
    private LocalTime fin;
    private Semaine jour;

    public Horaire(LocalTime d, LocalTime f, Semaine j){
        debut = d;
        fin = f;
        jour = j;
    }

    public LocalTime getDebut() {
        return debut;
    }

    public LocalTime getFin() {
        return fin;
    }

    public Semaine getJour() {
        return jour;
    }

    public String toString(){
        return "le "+jour+" de "+debut+" à "+fin;
    }



    @Override
    public int compareTo(Horaire o) {
        int result = this.jour.compareTo(o.jour);
        if(result==0){
            result=this.debut.compareTo(o.debut);
        }
        return result;
    }
}

