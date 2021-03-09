import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner numberInput=new Scanner(System.in);
    System.out.println("Please enter a number: ");
    double factNumber=numberInput.nextDouble();
    System.out.println(factorial(factNumber));
  }
public static double factorial(double number){
  if(number==0){
    return 1;
  }else{
    return number* factorial(number-1);
  }
}
}