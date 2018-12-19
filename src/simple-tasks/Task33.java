/**
 * Task 33) Write a method to calculate the average value of array elements. return the average as a float
 */
public class Task33 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float f = calcAverage(a);
        System.out.println(f);
    }

    private static float calcAverage(int[] a) {
        float returnAverage = 0.0f;

        for (int i = 0; i < a.length; i++) {
            returnAverage += a[i];
        }

        return returnAverage / a.length;
    }

}
 