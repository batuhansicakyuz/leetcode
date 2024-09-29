package top75;

public class mergeTwo {
    public static void main(String[] args) {

    }

    public String mergeAlternatly(String word1, String word2){

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < word1.length() || i<word2.length()){

            if(i< word1.length()){
                sb.append(word1.length());
            }

            if(i< word2.length()){
                sb.append(word2.length());
            }
            i++;

        }
        return sb.toString();
    }



}
