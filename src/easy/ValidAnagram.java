package easy;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
    ValidAnagram va = new ValidAnagram();
    String s = "cat";
    String t = "tac";
    System.out.println(va.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t){
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        if (!Arrays.equals(charsS, charsT)) return false;
        return true;
    }
}
