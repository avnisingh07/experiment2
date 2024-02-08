package assignment2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Convert array to ArrayList
        ArrayList<Integer> arrayListFromArr = convertArrayToArrayList(arr);
        System.out.println("ArrayList from array: " + arrayListFromArr);

        // Convert ArrayList to array
        int[] arrFromArrayList = convertArrayListToArray(arrayListFromArr);
        System.out.println("Array from ArrayList: " + Arrays.toString(arrFromArrayList));

        scanner.close();
    }

    // Method to convert array to ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        return arrayList;
    }

    // Method to convert ArrayList to array
    public static int[] convertArrayListToArray(ArrayList<Integer> arrayList) {
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
