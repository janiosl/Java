import java.util.Arrays;
public class ArrayTools {
    public static void main(String args[]) {
        //Creation
        double arr1[] = {1.8, 1.4, 1.2, 1.6, 2.0};
        System.out.println("Original array: " + Arrays.toString(arr1));
        //Copy
        double arr2[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Is Array 1 equals to Array 2:" + Arrays.equals(arr1, arr2));
        //Sort
        Arrays.sort(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));
        System.out.println("Is Array 1 equals to Array 2:" + Arrays.equals(arr1, arr2));
        //Parcial copy
        double arr3[] = Arrays.copyOfRange(arr1, 2, 5);
        System.out.println("Slice of Array 1: " + Arrays.toString(arr3));
        //Content analysis
        System.out.println("2nd element: " + arr1[2]);
        boolean test = arr1[2] == 1.6;
        System.out.println(test);
    }
}
