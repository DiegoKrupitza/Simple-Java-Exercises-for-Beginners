/**
 * Task 40) Replace a character in a given String with another character
 * Note: do not use the replaceAll method from String -> the goal is to write your own representation of replaceAll
 */
public class Task40 {


    public static void main(String[] args) {
        String s = replaceAll("ABC aBC BBDEf", 'b', 'B');
        System.out.println(s);
    }

    private static String replaceAll(String string, char replacer, char find) {
        String s = "";

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current == find) {
                //NOTE: in bigger applications its important not to use "simple" concatenations, because it creates
                // every time a new string and that leads to hard work for the garbage collector
                s += replacer;
            } else {
                s += current;
            }

        }

        return s;
    }

}
