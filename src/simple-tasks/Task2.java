/*
   Task 2) Zahlen zwischen (inkl.) 1 - (inkl.) 100 getrennt durch ein "+" ausgeben, die durch 6 und 9 teilbar sind.
 */
public class Task2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            if(i%6 ==  0 && i %9 == 0) {
                System.out.print(i + "+");
            }
        }

    }
}

