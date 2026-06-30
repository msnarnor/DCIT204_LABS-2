import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for array size
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[size];

        // Step 3: Input elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Step 4: Find maximum value and index
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        // Step 5: Display result
        System.out.println("\n--- Result ---");
        System.out.println("Maximum value: " + max);
        System.out.println("Index: " + index);

        scanner.close();
    }
}
