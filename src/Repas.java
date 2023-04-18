import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Repas extends Activite{

    public static Map<String,Activite> repas = new HashMap<>();

    //type = "repas"
    public Repas(String Nom, String type, Horaire h, double prix) {
        super(Nom, type, h,prix);
        repas.put(Nom,this);
    }

}
