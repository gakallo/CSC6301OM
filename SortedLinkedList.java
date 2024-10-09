import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Program reads integers from user, stores them in a LinkedList,
 * sorts them, and prints the sorted list.
 */
public class SortedLinkedList {

    /**
     * Main method: Reads input, sorts, and displays the list.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Use Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Use LinkedList to store integers
        List<Integer> numbers = new LinkedList<>();

        // Prompt for input
        System.out.println("Enter integers. Type 'done' to finish:");

        // Read integers until 'done' is entered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt()); // Add valid integers
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break; // Stop input when 'done' is entered
            } else {
                System.out.println("Enter valid integer or 'done'.");
            }
        }

        // Sort the LinkedList using Collections.sort()
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted numbers: " + numbers);
    }
}

// Collection, Scanner, LinkedList are examples code reuse. 