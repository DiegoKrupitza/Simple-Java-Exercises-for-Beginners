/**
 * Task 44) Compare to Strings and find the biggest character at the current positon. Write that bigger character into an array. If one string is bigger than the other one write the rest of the bigger string into that array
 * For example:
 * stringComparer("TestString", "Thats a 2 TestString ABCDEF") ----> ThststringTestString ABCDEF
 */
public class Task44 {

    public static void main(String[] args) {
        char[] c = stringComparer("TestString", "Thats a 2 TestString ABCDEF");
        System.out.println(c);
    }

    private static char[] stringComparer(String s1, String s2) {
        String biggerString;
        String workString;
        int lenght;
        if (s1.length() > s2.length()) {
            lenght = s1.length();
            biggerString = s1;
            workString = s2; // selecting the smaller one
        } else {
            lenght = s2.length();
            biggerString = s2;
            workString = s1; // selecting the smaller one
        }

        char[] returnChar = new char[lenght];

        for (int i = 0; i < workString.length(); i++) {
            char currentS1 = s1.charAt(i);
            char currentS2 = s2.charAt(i);
            returnChar[i] = (currentS1 > currentS2) ? currentS1 : currentS2;
        }

        for (int i = workString.length(); i < biggerString.length(); i++) {
            returnChar[i] = biggerString.charAt(i);
        }


        return returnChar;
    }

}
