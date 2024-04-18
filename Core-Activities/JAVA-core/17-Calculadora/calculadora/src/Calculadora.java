import java.util.ArrayList;

public class Calculadora {
    private ArrayList<Double> operators;
    private ArrayList<Character> operations;
    private double result;
    private boolean numberFlag;

    public Calculadora() {
        this.operators = new ArrayList<>();
        this.operations = new ArrayList<>();
        this.result = 0;
        this.numberFlag = false;
    }

    public void performOperation(double value){
        if(numberFlag){
            System.out.println("Error, number already stablished");
            return;
        }
        operators.add(value);
        numberFlag = true;
    }
 
    public void performOperation(char c){
        if (!numberFlag) {
            System.out.println("Error, operator already stablished");
            return;
        }
        if (c == '=') {
            this.performOperation();
        }
        else{
            operations.add(c);
        }
        numberFlag = false;
    }

    private void performOperation(){
        int operationCount = 0;
        //multiplications, divisions
        for (int i = 0; i < operations.size(); i++) {
            switch (operations.get(i)) {
                case '*':
                    operators.set(i - operationCount, operators.get(i - operationCount) * operators.get(i + 1 - operationCount));
                    operators.remove(i + 1 - operationCount);
                    operationCount++;
                    break;
                case '/':
                    operators.set(i - operationCount, operators.get(i - operationCount) / operators.get(i + 1 - operationCount));
                    operators.remove(i + 1 - operationCount);
                    operationCount++;
                    break;
                default:
                    break;
            }
        }

        //Sum sub        
        for (int i = 0; i < operations.size(); i++) {
            switch (operations.get(i)) {
                case '*':
                    operators.set(i - operationCount, operators.get(i - operationCount) + operators.get(i + 1 - operationCount));
                    operators.remove(i + 1 - operationCount);
                    operationCount++;
                    break;
                case '/':
                    operators.set(i - operationCount, operators.get(i - operationCount) - operators.get(i + 1 - operationCount));
                    operators.remove(i + 1 - operationCount);
                    operationCount++;
                    break;
                default:
                    break;
            }
        }

        this.result = operators.get(0);
        operators.clear();
    }

    public double getResult(){
        return this.result;
    }
}
