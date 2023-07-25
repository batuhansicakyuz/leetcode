package top75;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "ABCDABCDABCD";

        GreatestCommonDivisorofStrings gc = new GreatestCommonDivisorofStrings();
        System.out.println(gc.gcdOfStrings(str1,str2));
    }

    /*
    i=0;
    str1/str2 = ;

     */
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()){
        return gcdOfStrings(str2,str1);
        }else if(!str1.startsWith(str2)){
        return "";
        }else if (str2.isEmpty()){
        return str1;
        }else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }

}
