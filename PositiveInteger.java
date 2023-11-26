import java.util.Scanner;

public class PositiveInteger {

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
 
   System.out.print("Enter positive integer: ");
   float userInput = input.nextFloat();
 
    if(userInput % 2 == 0)
    System.out.println("Not a prime number: "); 
  else
    System.out.println("Is a prime number: ");




 }

}