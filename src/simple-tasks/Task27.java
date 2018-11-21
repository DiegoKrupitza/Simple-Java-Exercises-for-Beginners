/*
 gegeben ist der String "dies ist der erste String in diesem Programm" nach jedem vorkommen eines bestimmten character soll danach groß herausgeschrieben werden, wie oft es vorkommt!
 Maximal soll es bis zu DREI kommen.
 Sprich bei dem oben angeführt String soll "diEINSes ist dZWEIer DREIerste String in diesem Programm" herauskommen
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
