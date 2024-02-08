package assignment2;
import java.util.Scanner;
public class NearestNeighbours {
    public static int findNearestNeighboursIndex(int[] arr) {
        if (arr == null || arr.length < 2)
            return -1; // If the array is null or has less than 2 elements, return -1

        int minDistance = Integer.MAX_VALUE;
        int nearestIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                nearestIndex = i;
            }
        }

        return nearestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int index = findNearestNeighboursIndex(arr);
        if (index != -1) {
            System.out.println("Nearest neighbours are: " + arr[index] + " and " + arr[index + 1]);
            System.out.println("Index of the first number: " + index);
        } else {
            System.out.println("Array is null or too short.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
