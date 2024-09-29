package topinterview150;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.size;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 3};
        int value = 3;

        System.out.println(removeElement(nums,value));

    }

    public static int removeElement(int[] nums, int val) {
/*
sayılara tek tek bak
value ye eşitse sil - değilse kalsın
toplam kaç tane sayı varsa göster
 */
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
