public class Aplicacion {
    public static void main(String [] args){
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(2, 3);

        fraccion1.imprimeFraccion();
        fraccion2.imprimeFraccion();

        //fraccion1.setNumerador(3);
        //fraccion1.setDenominador(4);

        System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador());

        Fraccion resultado = fraccion1.sumaFraccion(fraccion2);
        resultado.imprimeFraccion();

    }
}
