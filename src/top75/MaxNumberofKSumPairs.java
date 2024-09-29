package top75;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9}; // örnek dizi
        int k = 12;
        System.out.println(maxOperations(nums,k));
    }

    public static int maxOperations(int[] nums, int k){
        int n=nums.length;
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i]>k){
                continue;
            }
            for (int j=i+1; j<n;j++){
                if(nums[j]>k){
                    continue;
                }
                else if(nums[i]+nums[j]==k){
                    count++;
                    nums[j] = k+2;
                    nums[i] = k+2;
                    break;
                }
            }

        }
        return count;
    }
}
