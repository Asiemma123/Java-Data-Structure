import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // Array-list to store input
        ArrayList<Double> list = new ArrayList<>();

        // scanner object for scanning input
        Scanner scanner = new Scanner(System.in);

        // For loop to take input for 5 numbers
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter number " + (i + 1));
            list.add(scanner.nextDouble());
        }

        // declaring the variables with appropriate value
        double sum = 0, product = 1, largest = list.get(0), smallest = list.get(0);

        // For Loop to go  through the Array-list.
        for(int i = 0; i < 5; i++) {
        	
        	// Add element to sum
            sum += list.get(i); 
            
            // Add element to product 
            product *= list.get(i); 
            
            // Checking for largest element 
            largest = Math.max(largest, list.get(i)); 
            //Check for smallest element
            smallest = Math.min(smallest, list.get(i)); 
        }

        // Print results to screen 
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The largest is: " + largest);
        System.out.println("The smallest is: " + smallest);
    }
}