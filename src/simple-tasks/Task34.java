/**
 * Task 34) Write a method with the name 'findInt(int[] array)' to test if an array contains a specific value. Return of the method should be a boolean
 */
public class Task34 {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 2, 4};
        System.out.println(findInt(a));
    }

    private static boolean findInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                return true;
            }
        }
        return false;
    }

}
