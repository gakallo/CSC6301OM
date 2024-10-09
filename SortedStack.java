import java.util.Collections;
import java.util.Scanner;
import java.util.Stack; // updated from LinkedList to Stack

/**
 * Program reads integers from user, stores them in a Stack,
 * sorts them, and prints the sorted stack.
 * Input continues until the user types "done".
 */
public class SortedStack {

    /**
     * Main method: Reads input, sorts, and displays the stack.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Use Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Use Stack to store integers
        Stack<Integer> numbers = new Stack<>();

        // Prompt for input
        System.out.println("Enter integers. Type 'done' to finish:");

        // Read integers until 'done' is entered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.push(scanner.nextInt()); // Add valid integers to the stack
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break; // Stop input when 'done' is entered
            } else {
                System.out.println("Enter valid integer or 'done'.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Sort the Stack using Collections.sort()
        Collections.sort(numbers); // Sorting the stack (internally treated as a list)

        // Display the sorted stack
        System.out.println("Sorted numbers (from Stack): " + numbers);
    }
}

 /*Collections.sort-->reuse sort method for the stack provided by collection class
  *Scanner class--> reuse Scanner class from util package to handle user input from the command line.
  * Stack class --> Reuse stack class to store elements in this case integers
 */
 
 /*Commands to use in the command line
     * javac SortedStack.java
     * java SortedStack
     * javadoc -d doc SortedStack.java
     * 
  */