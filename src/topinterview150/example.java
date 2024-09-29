package topinterview150;

import java.util.HashMap;

public class example {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 12);
        hashMap.put("Jim", 19);
        hashMap.put("Jack", 15);

        hashMap.put("John",13);
        System.out.println(hashMap.get("John"));
        hashMap.remove("Jim");
        System.out.println(hashMap.get("Jim"));


    }


}
