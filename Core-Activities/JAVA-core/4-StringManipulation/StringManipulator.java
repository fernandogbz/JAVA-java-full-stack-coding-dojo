public class StringManipulator {
    public String trimAndConcat(String s1, String s2){
        return s1.trim() + s2.trim();
    }

    public int getIndexOrNull(String s, char c){
        return s.indexOf(c);
    }

    public int getIndexOrNull(String s1, String s2){
        return s1.indexOf(s2);
    }

    public String concatSubstring(String s1, int a, int b, String s2){
        return s1.substring(a, b) + s2;
    }
}
