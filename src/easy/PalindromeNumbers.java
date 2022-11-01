package easy;

public class PalindromeNumbers {

    public static void main(String[] args) {

        PalindromeNumbers pn = new PalindromeNumbers();
        System.out.println(pn.isPalindrome(1551));

    }

    public boolean isPalindrome(int x) {

        if(x<0 || ( x % 10 == 0 && x != 0)) return false;

        int r = 0;

        while (x > r){
            r = r * 10 + x % 10;
            x = x / 10;
        }

        return (r == x || r / 10 == x) ;
    }
}
//