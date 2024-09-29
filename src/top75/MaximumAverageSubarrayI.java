package top75;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }



     static double findMaxAverage(int[] nums, int k) {

        //1 tane array 1 tane subarray olucak , sırasıyla gezicekler
        //ilk 4 ü topla 4 / e böl , ikinci 4 ü topla 4 e böl
        //en büyük olan hangisiyse rakamlarını göster

        //gecici toplam
        int currentSum = 0;
        //ilk 4 sayının toplamı
        for(int i = 0; i <= k; i++ ){
            currentSum += nums[i];
        }

        // suanki max toplam
        int maxSum = currentSum;

        //sliding window
        for (int i = k ; i < nums.length; i++){
            currentSum = currentSum + nums[i] - nums[i-k];
            maxSum = Math.max(currentSum,maxSum);
        }


        return (double) maxSum / k;

    }
}
