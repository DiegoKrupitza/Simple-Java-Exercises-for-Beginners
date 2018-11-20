/*
    Task 1) Einen beliebigen String gespiegelt ausgeben.
 */
public class Task1 {
    public static void main(String[] args) {

        String myString = "Das ist ein Test";

        for (int i = myString.length() - 1; i >= 0 ; i--) {
            System.out.print(myString.charAt(i));
        }

    }
}

