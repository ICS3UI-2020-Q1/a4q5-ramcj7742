import java.util.Scanner;
/**
 * Does the hailstone pattern from user number
 * @author Jaden Rancharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets user number
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int num = input.nextInt();

    System.out.println("Hailstone sequence is the following:");

    //hailstone pattern
    System.out.println(num);
    while(num != 1){
      //Equations for odd and even numbers
      int oddNum = num * 3 + 1;
      int evenNum = num / 2;
      //Determines weather number is odd or even and displays correct number
      if(num % 2 == 0){
        System.out.println(evenNum);
        //changes value of num so it doesnt become an infinite loop
        num = num / 2;
      }else if(num % 2 != 0){
        System.out.println(oddNum);
        //changes value of num so it doesnt become an infinite loop
        num = num * 3 + 1;
      }
    }
    
  }
}
