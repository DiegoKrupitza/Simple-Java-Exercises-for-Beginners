/*
 Task 27) The string "dies ist der erste String in diesem Programm" is given. After each occurrence of a certain character, it should be capitalized how often it occurs!  Maximum it should come up to THREE. That means with the string mentioned above "diEINSes ist dZWEIer DREIerste String in diesem Programm" should come out.
 */
public class Task27 {
    public static void main(String[] args) {
        String s = "dies ist der erste String in diesem Programm";
        char checkChar = 'e';

        int count = 0;
        String outString = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == checkChar && count == 0) {
                outString += "EINS" + currentChar;
                count++;
            } else if (currentChar == checkChar && count == 1) {
                outString += "ZWEI" + currentChar;
                count++;
            } else if (currentChar == checkChar && count == 2) {
                outString += "DREI" + currentChar;
                count++;
            } else {
                outString += currentChar;
            }
        }

        System.out.println(outString);

    }
}
