/*
    Task 1) Output any string mirrored.
 */
public class Task1 {
    public static void main(String[] args) {

        String myString = "Das ist ein Test";

        for (int i = myString.length() - 1; i >= 0 ; i--) {
            System.out.print(myString.charAt(i));
        }

    }
}

