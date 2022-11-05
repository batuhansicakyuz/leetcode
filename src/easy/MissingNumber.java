package easy;

public class MissingNumber {

    public static void main(String[] args) {

        MissingNumber mn = new MissingNumber();
        int[] numbs = new int[]{ 0,1,2,3,4,6 };
        System.out.println(mn.missingNumber(numbs));
    }
    public int missingNumber(int[] numbs) {
        int n = numbs.length, actualSum = 0;
        int expectedSum = n * (n + 1) / 2;
        for(int i=0 ; i<n ; i++){
            actualSum += numbs[i];
        }
        return expectedSum - actualSum;
    }
}
