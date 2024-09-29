package top75;

public class MaximumNumberofVowelsinaSubstringofGivenLength {

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));

    }
    public static int maxVowels(String s, int k) {

        String vowels = "aeiou";

        int maxVowels = 0;
        int currentVovelCount = 0;

        //ilk k uzunlugundaki ünlü harfleri say - k = pencere
        for (int i = 0; i < k; i++) {
            if(vowels.indexOf(s.charAt(i)) != -1){
                currentVovelCount++;
            }
        }
        // currentVovel kısmındaki maxVowel a eşit . çünkü aradıgımız kısım burası
        maxVowels = currentVovelCount;

        //pencereyi kaydır
        for( int i = k; i < s.length(); i++){
            // giren karakter ünlüyse
            if(vowels.indexOf(s.charAt(i)) != -1){
                currentVovelCount++;
            }
            // çıkan karakter ünlü degilse
            if(vowels.indexOf(s.charAt(i-k)) != -1){
                currentVovelCount--;
            }

            maxVowels = Math.max(maxVowels, currentVovelCount);

        }
        return maxVowels;
    }
}
