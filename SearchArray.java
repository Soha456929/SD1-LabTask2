import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println(key + " is found at index " + i);
                break;
            }
        }
        if (!found) System.out.println(key + " is not found.");

        sc.close();
    }
}