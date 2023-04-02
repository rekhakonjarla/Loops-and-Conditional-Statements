import java.util.Scanner;

public class Average_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int smallest = num1;
        if(num2 < smallest) {
            smallest = num2;
        }
        if(num3 < smallest) {
            smallest = num3;
        }
        int largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }
        double average = (double)(num1 + num2 + num3) / 3;
        System.out.println("The Smallest Number: " + smallest);
        System.out.println("The Largest Number: " + largest);
        System.out.println("Average of all three numbers: " + average);
    }
}
