import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println("The average of the array is: " + average);

        sc.close();
    }
}
