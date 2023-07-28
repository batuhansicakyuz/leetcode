package top75;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Integer[] flowerbed = {1,0,0,0,1};
        int n = 1;

        CanPlaceFlowers cpf = new CanPlaceFlowers();
        System.out.println(cpf.canPlaceFlowers(flowerbed,n));
    }

    /*
    baştan sona bi tara

     */
    public boolean canPlaceFlowers(Integer[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
