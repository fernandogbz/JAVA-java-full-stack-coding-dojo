import java.util.HashMap;
import java.util.Set;

public class Mapas {
    public static void main(String [] args){
        HashMap<String, String> mapaDeCorreos = new HashMap<String, String>();

        mapaDeCorreos.put("alex@miller.com", "Alex Miller");
        mapaDeCorreos.put("martha@gomez.com", "Martha Gómez");
        mapaDeCorreos.put("julieta@moralez.com", "Julieta Morales");

        //System.out.println(mapaDeCorreos.get("marthas@gomez.com"));

        Set<String> propiedades = mapaDeCorreos.keySet();
        for(String llave : propiedades){
            System.out.println(llave);
            System.out.println(mapaDeCorreos.get(llave));
        }
    }
}
