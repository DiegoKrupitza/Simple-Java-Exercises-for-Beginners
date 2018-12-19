/**
 * Task 32) Write a method to sum values of an int array
 */
public class Task32 {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 4, 1};

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

}
