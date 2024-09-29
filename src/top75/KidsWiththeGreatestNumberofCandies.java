package top75;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        Integer[] candies = {2,3,5,1,3};
        int extraCandies = 3;


        KidsWiththeGreatestNumberofCandies kg = new KidsWiththeGreatestNumberofCandies();
        System.out.println(kg.kidsWithCandies(candies,extraCandies));
    }
    public List<Boolean> kidsWithCandies(Integer[] candies, int extraCandies) {
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> b = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            b.add(candies[i] + extraCandies >= max);
        }
        return b;

        /*
        2. çözüm
        // int[] dizisini List<Integer> yapısına dönüştürün
        List<Integer> numberList = new ArrayList<>();
        for (int num : candies) {
            numberList.add(num);  // Primitif int'ten Integer'a otomatik kutulama (autoboxing)
        }
        // en buyuk deger hangisi onu bul


        // En büyük elemanı bul
        int maxNumber = Collections.max(numberList);
        // listedeki tüm değerleri verilen değerle topla

        List<int[]> candiesList = Arrays.asList(candies);

        List <Integer> resultList = new ArrayList<>();

        for (int[] candie : candiesList){
            for (int candy : candie) {
                resultList.add(candy + extraCandies);
            }
        }

        // toplanan her değer > en buyuk degerden kucukse false, buyukse true
        List<Boolean> comparisonResults = new ArrayList<>();

        for(int x = 0; x < candies.length; x++){
            if(maxNumber > resultList.get(x)){
                comparisonResults.add(false);
            } else {
                comparisonResults.add(true);
            }
        }

        return comparisonResults;
         */
    }
}
