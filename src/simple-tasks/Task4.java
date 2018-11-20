/*
   Task 4) Die Buchstaben eines Strings auf ein Charakter überprüfen, falls die Buchstaben nicht gleich sind,
   soll die Buchstabe mit ein '#' ersetzt werden, sonst soll die Buchstabe mit dem Charakter ersetzt werden.
*/

public class Task4 {
    public static void main(String[] args) {
        char checkChar = 's';
        String meinString = "oeiufhwpiuvnsdsdsdghzjzkuikjuhztgcgfbzzgtrcefbrbgvfeoqirfjwcprfimc";
        String printString = "";
        for (int i = 0; i < meinString.length(); i++) {
            char charAtPoint = meinString.charAt(i);
            if(charAtPoint != checkChar) {
               printString += "#";
            }else {
                printString += charAtPoint;
            }
        }

        System.out.println(printString);

    }
}