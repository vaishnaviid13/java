import java.util.Scanner;
public class Factorial{
  public static void main(String[]args)
  {
    Scanner scanner = new
    Scanner(System.in);
    System.out.print("Enter a number:");
    int number = scanner.nextInt();
    long Factorial = 1;
    for (int i=1;i<= number; i++)
    {
      Factorial *= i;
    }
    System.out.println("Factorial of" + number +"is:" + Factorial);
    scanner.close();
  }
}