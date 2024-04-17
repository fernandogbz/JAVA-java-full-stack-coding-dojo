public class Strings {
    public static void main(String [] args){
        String mensaje = "   Bienvenidos al lenguaje de Java   ";
        System.out.println(mensaje.length());
        System.out.println(mensaje);
        System.out.println(mensaje.trim());
        System.out.println(mensaje.toLowerCase());
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.indexOf("al"));

        String nombreUno = new String("Alejandro");
        String nombreDos = new String("Alejandro");

        System.out.println(nombreUno.equals(nombreDos));

        mensaje += " Esta es una nueva oración.";
        System.out.println(mensaje);

    }
}
