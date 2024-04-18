import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        //1
        ArrayList<Integer> answer1 = puzzle.greaterThan10();
        System.out.println(answer1.get(2));

        //2
        ArrayList<String> answer2 = puzzle.lengthGreaterThan5();
        System.out.println(answer2.get(0));

        //3
        puzzle.charArray();

        //4
        ArrayList<Integer> answer4 = puzzle.randomArray();
        System.out.println(answer4);

        //5
        ArrayList<Integer> answer5 = puzzle.randomArraySorted();

        //6
        System.out.println(puzzle.randomString());
        
        //7
        ArrayList<String> answer7 = puzzle.randomString10();
        System.out.println(answer7);

    }
}
