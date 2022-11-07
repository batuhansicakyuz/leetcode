package easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] numbs = new int[]{ 1,2,3,4 };
        System.out.println(cd.containsDuplicate(numbs));
    }
    public boolean containsDuplicate(int[] numbs){
        HashSet<Integer> numbers = new HashSet<>();

        for (int i=0; i<numbs.length; i++) {
            if(numbers.contains(numbs[i])) return true;
            numbers.add(numbs[i]);
        }
        return false;
    }
}
