import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner numberInput = new Scanner(System.in);
    System.out.println("Please enter a number for factorials: ");
    double factNumber = numberInput.nextDouble();
    System.out.print("you have entered " + factNumber + ". The factorial is: ");
    System.out.println(factorial(factNumber));
    System.out.println("please enter a number for triangle number thingy: ");
    double triNumber = numberInput.nextDouble();
    System.out.print("you have entered " + triNumber + ". The sum is: ");
    System.out.println(triangle(triNumber));

  }

  public static double factorial(double number) {
    if (number == 0) {
      return 1;
    } else {
      return number * factorial(number - 1);
    }
  }

  public static double triangle(double number) {
    if (number == 0) {
      return 1;
    } else {
      return number + factorial(number - 1);
    }
  }
}