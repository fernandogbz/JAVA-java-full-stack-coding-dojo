import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    //1
    public ArrayList<Integer> greaterThan10(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        Collections.addAll(array, 3,5,1,2,7,9,8,13,25,32);
        int sum = 0;
        for (Integer i : array) {
            sum += i;
            if (i > 10) {
                result.add(i);
            }
        }
        System.out.println(sum);
        return result;
    }

    //2
    public ArrayList<String> lengthGreaterThan5(){
        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        Collections.addAll(array, "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa");
        for (String string : array) {
            System.out.println(string);
            if (string.length() > 5) {
                result.add(string);
            }
        }
        return result;
    }

    //3
    public void charArray(){
        ArrayList<Character> array = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            array.add((char)('A' + i));
        }
        Collections.shuffle(array);
        System.out.println("Last: " + array.get(array.size() - 1) + " First: " + array.get(0));
        if ("AEIOU".indexOf(array.get(0)) >= 0) {
            System.out.println("Vowel");
        }
    }

    //4
    public ArrayList<Integer> randomArray(){
        ArrayList<Integer> array = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(r.nextInt(46) + 55);
        }
        return array;
    }

    //5
    public ArrayList<Integer> randomArraySorted(){
        ArrayList<Integer> array = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(r.nextInt(46) + 55);
        }
        Collections.sort(array);
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Min: " + array.get(0) + " Max: " + array.get(array.size() - 1));
        return array;
    }

    public String randomString(){
        Random r = new Random();
        char[] s = new char[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = (char)(r.nextInt(26) + 'a');
        }
        return new String(s);
    }

    public ArrayList<String> randomString10(){
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(randomString());
        }
        return array;
    }
}