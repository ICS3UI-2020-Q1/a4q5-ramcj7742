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

    //hailstone pattern
    while(num != 1){
      if(num % 2 == 0){
        System.out.println(num / 2);
      }else if(num % 2 != 0){
        System.out.println(num * 3 + 1);
      }
    }
    
  }
}
