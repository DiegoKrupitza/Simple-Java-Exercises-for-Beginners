/**
 * Task 42) Write a method that gets an integer array and returns the same array with an extra element that is the calculated average of the given array.
 * For example:
 * {1,2,3,4,5,6} -> {1,2,3,4,5,6, 3}
 */
public class Task42 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = addAvg(a);
        printArray(b);
    }

    private static void printArray(int[] b) {
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    private static int[] addAvg(int[] a) {
        int[] b = new int[a.length + 1];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            sum += a[i];
        }

        b[b.length - 1] = sum / a.length;

        return b;
    }
}
