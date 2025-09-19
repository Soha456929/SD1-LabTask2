import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); // sort the array

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
