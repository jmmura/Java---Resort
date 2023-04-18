import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Stage extends Activite{

    public static Map<String,Activite> stages = new HashMap<>();
    public Stage(String Nom, String type,Horaire h,double prix) {
        super(Nom, type, h,prix);
        stages.put(Nom,this);
    }
}
