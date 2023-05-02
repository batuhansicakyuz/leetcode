package easy;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger rI = new RomanToInteger();
        String s = "XC";
        System.out.println(rI.romanToInt(s));

    }

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //len = length, result = XC ise X'i bulmanı sağlar
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            //eger 0. deger 1 den buyukse topla degilse çıkar
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
        return result;
    }
}