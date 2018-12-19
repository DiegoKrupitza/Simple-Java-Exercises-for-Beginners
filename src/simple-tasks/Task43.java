/**
 * Task 43) Write a method that deletes the following character of a String when a certain character is occurring.
 * For example:
 * deleteNext("ABCDEFCG",'C') ---> ABCEFC
 */
public class Task43 {

    public static void main(String[] args) {
        String s = deleteNext("ABCDEFCG", 'C');
        System.out.println(s);
    }

    private static String deleteNext(String s, char c) {
        String returnString = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == c) {
                i++;
            }
            returnString += currentChar;
        }

        return returnString;
    }

}
