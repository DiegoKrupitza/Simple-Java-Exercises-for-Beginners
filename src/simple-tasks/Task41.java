import java.util.Arrays;

/**
 *
 */
public class Task41 {

    public static void main(String[] args) {
        int[] a = new int[10];
        fillArray(a);
        printArray(a);
    }

    private static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 10 - i;
        }
    }

}
