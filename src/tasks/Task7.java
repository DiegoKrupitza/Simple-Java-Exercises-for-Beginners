/**
 * Task 7) Formattiere eine Binärzahl (String) in 4er Blöcke, von hinten begonnen also z.B. 10100 wird zu 1 0100
 */
public class Task7 {
    public static void main(String[] args) {

        String binaryNumber = "1000101010010110101011010000100101";
        String formatetBinary = formatBinary(binaryNumber);
        System.out.println(formatetBinary);
    }

    private static String formatBinary(String binaryNumber) {
        String workString = "";

        // iterates from back to front
        for (int i = binaryNumber.length() - 1, counter = 0; i >= 0; i--, counter++) {
            if (counter % 4 == 0) {
                workString += " " + binaryNumber.charAt(i);
            } else {
                workString += binaryNumber.charAt(i);
            }
        }

        // flip side back
        String returnString = "";
        for (int i = workString.length() - 1; i > 0; i--) {
            returnString += workString.charAt(i);
        }

        return returnString;
    }

}
