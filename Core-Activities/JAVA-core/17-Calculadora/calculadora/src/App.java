public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculator = new Calculadora();
        calculator.performOperation(10.5);
        calculator.performOperation('+');
        calculator.performOperation(5.2);
        calculator.performOperation('*');
        calculator.performOperation(10);
        calculator.performOperation('=');


        System.out.println(calculator.getResult());
    }
}
