public class Metodos {
    public static void main(String [] args){
        int resultado = sumaDosNumeros(20, 50);
        System.out.println(resultado);
        resultado = sumaDosNumeros(100, 80);
        System.out.println(resultado);
        imprimeHola();
    }

    public static int sumaDosNumeros(int num1, int num2){
        int total = num1 + num2;
        return total;
    }

    public static void imprimeHola(){
        System.out.println("¡Hola!");
    }
}

