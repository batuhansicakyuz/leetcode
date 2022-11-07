package easy;

public class ValidPalindrome {
    public static void main(String[] args) {

        ValidPalindrome vp = new ValidPalindrome();
        //String s = "amanaplanacanalpanama";
        String s = "abc&%33%&cba";
        System.out.println(vp.isPalindrome(s));
    }
    public boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("\\<.*\\>", "");
        int i = 0;
        int j = s.length()-1;

        while (i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
