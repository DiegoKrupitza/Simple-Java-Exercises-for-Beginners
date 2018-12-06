/*
   Task 4)
   Replace all the characters with '#' that aren't 's'. This should also work with other characters. So please use a variable
   Example: "a1defcaad" -> "#1defc##d"
*/

public class Task4 {
    public static void main(String[] args) {
        char checkChar = 's';
        String myString = "oeiufhwpiuvnsdsdsdghzjzkuikjuhztgcgfbzzgtrcefbrbgvfeoqirfjwcprfimc";
        String printString = "";
        for (int i = 0; i < myString.length(); i++) {
            char charAtPoint = myString.charAt(i);
            if(charAtPoint != checkChar) {
               printString += "#";
            }else {
                printString += charAtPoint;
            }
        }

        System.out.println(printString);

    }
}