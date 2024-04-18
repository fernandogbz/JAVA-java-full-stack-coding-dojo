public class Main {
    public static void main(String[] args){
            BasicJava basicJava = new BasicJava();
            basicJava.print1To255();
            basicJava.printOdd255();
            basicJava.printSum255();
            int[] x = {1,3,5,7,9,13};
            basicJava.forEach(x);
            basicJava.getMax(x);
            basicJava.getAvg(x);
            basicJava.forEach(basicJava.getOdd255());
            System.out.println(basicJava.countGreater(x, 3));
            basicJava.squareArray(x);
            System.out.println(x[3]);
            for (int i : x) {
                System.out.print(i + " ");
            }
            System.out.println();
            basicJava.swiftLeft(x);
            for (int i : x) {
                System.out.print(i + " ");
            }
    }   
}