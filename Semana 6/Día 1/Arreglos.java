import java.util.ArrayList;

public class Arreglos{
    public static void main(String [] args){
        double [] calificaciones = new double[5];
        String [] nombres = {"Alex", "Mariana", "Alan", "Julieta", "Roger"};

        calificaciones[0] = 9.8;
        calificaciones[1] = 7.9;
        calificaciones[2] = 8.8;
        calificaciones[3] = 10.0;
        calificaciones[4] = 9.2;

        System.out.println(calificaciones.length);

        ArrayList<Integer> edades = new ArrayList<Integer>();
        System.out.println(edades.size());
        edades.add(25);
        edades.add(28);
        edades.add(20);
        edades.add(19);
        System.out.println(edades.size());
        System.out.println(edades.get(6));
    }
}