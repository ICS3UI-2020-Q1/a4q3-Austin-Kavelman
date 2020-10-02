import java.util.Scanner;

/**
 * 
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    //create a variable to keep of what number we are on
    int count = 1;
    //the accumilator to add the count info
    int total = 0;
    while(count <= 10){
    //add the numbers as we go into total
    total = total + count;
    //add 1 to our count to increase int0
    count = count + 1;
    }
    //print the total to the screen
    System.out.println("The total is " + total);
  }
}
