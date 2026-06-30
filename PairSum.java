import java.util.Scanner;

public class PairSum {
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

        // Step 4: Ask for target sum
        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        // Step 5: Brute force search
        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // Step 6: If no pair found
        if (!found) {
            System.out.println("\nNo pair found that adds up to target.");
        }

        scanner.close();
    }
}
