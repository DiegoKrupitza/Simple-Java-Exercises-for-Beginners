/*
    You read out a string and output it backwards. After that you output the sum of all characters afterwards
    Example:  Parken => nekraP, 609
 */
public class Task29 {

    public static void main(String[] args) {
        //String test = "M";
        //String test = "TANTE";
        String test = "Parken";
        //String test = "SpieLen";
        //String test = "MaxMustermann";

        int summe = 0;
        String ausgabe = "";
        for (int i = test.length() -1; i >= 0 ; i--) {
            char charatpoint = test.charAt(i);
            summe += charatpoint;
            ausgabe += charatpoint;
        }
        ausgabe += "," + summe;

        System.out.println(ausgabe);
    }

}
