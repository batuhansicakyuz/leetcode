package top75;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        // sol sağ max, zerocount int yaz
        int left = 0, right = 0;
        int maxLength = 0;
        int zerosCount = 0;

        //sag ucu dizinin sonuna kadar kaydir, eğer sıfır bulursan sıfırı arttır
        while (right < nums.length) {
            if (nums[right] == 0) {
                zerosCount++;
            }

            //eger 0 sayısı k dan fazlaysa pencereyi kucult
            while (zerosCount > k) {
                if (nums[left] == 0) {
                    zerosCount--;
                }
                left++;
            }
            //pencere boyutunu guncelle
            maxLength = Math.max(maxLength, right - left + 1);

            //sagı ilerlet
            right++;
        }

        return maxLength;
    }
}