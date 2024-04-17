public class Fraccion{
    // Atributos
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccion(int num, int den){
        numerador = num;
        denominador = den;
    }

    // Métodos Instancia
    public void imprimeFraccion(){
        System.out.println(numerador + "/" + denominador);
    }  

    public Fraccion sumaFraccion(Fraccion fraccion2){
        int nuevoNum = numerador * fraccion2.getDenominador() + denominador * fraccion2.getNumerador();
        int nuevoDen = denominador * fraccion2.getDenominador();
        return new Fraccion(nuevoNum, nuevoDen);
    }

    // Métodos de acceso
    public int getNumerador(){
        return numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    // Métodos de modificación
    public void setNumerador(int num){
        numerador = num;
    }

    public void setDenominador(int den){
        denominador = den;
    }
}
