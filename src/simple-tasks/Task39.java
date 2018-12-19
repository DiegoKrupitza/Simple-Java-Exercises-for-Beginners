/**
 * Task 39) Find the biggest character in a given String and return it
 */
public class Task39 {

    public static void main(String[] args) {
        char c = findBiggestChar("Das ist toll, zZ Tops");
        System.out.println(c);
    }

    private static char findBiggestChar(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (max < c) {
                max = c;
            }
        }
        return (char) max;
    }
}
