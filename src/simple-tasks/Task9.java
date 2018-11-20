/**
 * Task 9) String einlesen der Buchstaben und die Zahlen 2, 3 und 4 beinhaltet (z.B. H3eute is4t ein2 guter T2ag)
 * und die Zahl besagt wie oft der nachfolgende Char wiederholt wird (H2eute = Heeute).
 */
public class Task9 {
    public static void main(String[] args) {

        String myString = "H3eute is4t ein2 guter T2ag";
        String workString = "";
        int repeatFollowing = 0;
        for (int i = 0; i < myString.length(); i++) {
            char charaterAtPoint = myString.charAt(i);
            if (charaterAtPoint == '2') {
                repeatFollowing = 2;
            } else if (charaterAtPoint == '3') {
                repeatFollowing = 3;
            } else if (charaterAtPoint == '4') {
                repeatFollowing = 4;
            } else {
                workString += charaterAtPoint;
                for (int j = 0; j < repeatFollowing - 1; j++) {
                    workString += charaterAtPoint;
                }
                repeatFollowing = 0;
            }

        }

        System.out.println(workString);
    }
}
