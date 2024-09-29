package top75;

public class StringCompression {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c','c','c'};
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress(chars));
    }

    public int compress(char[] chars) {

        int index = 0;  // Güncellenmiş dizide hangi pozisyonda olduğumuzu takip eder
        int i = 0;      // Orijinal dizide tarama yapar

        while (i < chars.length) {
            char currentChar = chars[i];  // Şu anki karakteri al
            int count = 0;  // Bu karakterin tekrarlanma sayısını tutmak için

            // Aynı karakterlerden oluşan ardışık grup boyunca ilerle
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Karakteri güncellenmiş diziye ekle
            chars[index++] = currentChar;

            // Eğer birden fazla tekrar varsa, sayıyı da ekle
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;  // Sayıyı diziye karakter karakter ekle
                }
            }
        }

        return index;
    }
}
