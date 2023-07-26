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
    }
}
