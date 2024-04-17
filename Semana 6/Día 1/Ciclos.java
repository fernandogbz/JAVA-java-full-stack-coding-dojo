import java.util.ArrayList;

public class Ciclos {
    public static void main(String [] args){
        String [] nombres = {"Alex", "Mariana", "Alan", "Julieta", "Roger"};
        ArrayList<String> frutas = new ArrayList<String>();
        
        for(int i = 1; i <= 10; i ++){
            System.out.println(i);
        }
        System.out.println("----");
        for(int i = 0; i < nombres.length; i ++){
            System.out.println(nombres[i]);
        }
        System.out.println("----");

        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Plátano");
        frutas.add("Uva");
        frutas.add("Naranja");

        for(int i = 0; i < frutas.size(); i ++){
            System.out.println(frutas.get(i));
        }
        System.out.println("----");

        for(String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("----");
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i ++;
        }
    }
}
