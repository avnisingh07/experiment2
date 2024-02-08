package assignment2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] even;
        int[] odd;

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        even = new int[evenCount];
        odd = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even[evenIndex++] = number;
            } else {
                odd[oddIndex++] = number;
            }
        }

        System.out.println("Even numbers:");
        for (int num : even) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int num : odd) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

