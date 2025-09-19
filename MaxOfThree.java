import java.util.Scanner;

public class MaxOfThree{
    public static void main(String[] args){
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextInt( );

        System.out.print("Enter second number: ");
        number2 = input.nextInt( );

        System.out.print("Enter third number: ");
        number3 = input.nextInt( );

        if ((number1 >= number2) && (number1 >= number3))
            System.out.println("Number1 is maximum");
        else if ((number2 >= number1) && (number2 >= number3))
            System.out.println("Number2 is maximum");
        else
            System.out.println("Number3 is maximum");
    }
}
