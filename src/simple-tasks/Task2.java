/*
   Task 2) Display all numbers from 1 to 100 that can be divided by 9 or 6 with a "+".

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

