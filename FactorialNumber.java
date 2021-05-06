/*
* The factorial number porgram find the factorial of the inputted number
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-06
* Class FactorialNumber.
*/

// Import the Scanner class
import java.util.Scanner;

final class FactorialNumber {

  private FactorialNumber() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * This function find the factorial of the input.
  *
  * @param someInt
  * @return someInt
  */
  public static int factorial(final int someInt) {
    if (someInt == 1 || someInt == 0) {
      // Returns 1
      return 1;
    } else {
      // Returns the input -1 and stores it in some int
      return (someInt * factorial(someInt - 1));
    }
  }

  /**
   * This function handles all the inputs and outputs.
   *
   * @param args
   */
  public static void main(final String[] args) {
    try {
      Scanner scanInt = new Scanner(System.in);

      // Asks user to input an intiger
      System.out.println("Input an integer:");
      int userInt = scanInt.nextInt();

      // Calls the factorial function
      int factorialNum = factorial(userInt);

      // Outputs the original number and its factorial
      System.out.println();
      System.out.println("The factorial of " + userInt + " is: "
      + factorialNum);
      System.out.println();
      System.out.println("Done");

    } catch (Exception e) {
      System.out.println("Invalid Input. Please try again.");
    }
  }
}
