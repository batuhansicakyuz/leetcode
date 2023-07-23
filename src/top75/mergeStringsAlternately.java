package top75;

public class mergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "xyz";
        mergeStringsAlternately mg = new mergeStringsAlternately();
        System.out.println(mg.mergeAlternately(word1, word2));
    }
    /*
    string builder  result = string builder

    int i=0 oluştur

    while (i < word1) || ( i<word2) {

	if ( i < word1 ) {

	result.
	}

}


     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
