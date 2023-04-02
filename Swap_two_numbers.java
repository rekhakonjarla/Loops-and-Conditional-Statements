import java.util.Scanner;

public class Swap_two_numbers{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int numA = sc.nextInt();
      System.out.print("Enter the second number: ");
      int numB = sc.nextInt();
      System.out.println("Before swapping:");
      System.out.println("numA = " + numA);
      System.out.println("numB = " + numB);
      int temp = numA;
      numA = numB;
      numB = temp;
      System.out.println("After swapping:");
      System.out.println("numA = " + numA);
      System.out.println("numB = " + numB);
      
      sc.close();
   }
}