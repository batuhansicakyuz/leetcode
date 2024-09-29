package top75;

import java.util.Arrays;

public class DetermineifTwoStringsAreClose {

    public static void main(String[] args) {

    }

    public boolean closeStrings(String word1, String word2){

        if (word1.length() != word2.length()){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int[] exist1 = new int[26];
        int[] exist2 = new int[26];

        for (char c : word1.toCharArray()){
            freq1[c - 'a']++;
            exist1[c - 'a'] = 1;
        }

        for (char c : word2.toCharArray()){
            freq2[c - 'a']++;
            exist2[c - 'a'] = 1;
        }

        if(!Arrays.equals(exist1, exist2)) {
            return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}
