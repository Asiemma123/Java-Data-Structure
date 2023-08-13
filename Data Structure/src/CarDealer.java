import java.util.*;

public class CarDealer {
   

	public static void main(String[] args) {

       
        HashMap<String, ArrayList<Integer>> vehicles = new HashMap<String, ArrayList<Integer>>();

        // Some data to test Program 
        vehicles.put("Mercedes E 350", new ArrayList<Integer>(Arrays.asList(2003, 2010, 2017)));
        vehicles.put("Toyota Rav 4", new ArrayList<Integer>(Arrays.asList(2008, 2020)));
        vehicles.put("Honda Civic", new ArrayList<Integer>(Collections.singletonList(2017)));
        vehicles.put("Jeep Grand Cherooke", new ArrayList<Integer>(Arrays.asList(2015, 2016, 2017)));
        vehicles.put("Lexus", new ArrayList<Integer>(Arrays.asList(2015, 2017, 2020)));

       Scanner scanner = new Scanner(System.in);
        
       //Ask User for input
        System.out.println("Please enter the car you are looking for:");
        String input = scanner.nextLine();

        // check whether the vehicle is present or not.
        if(vehicles.containsKey(input)) {
            System.out.println("Oh, you're looking for a" + input + "?");
            
            // if present, print all the makes available for that vehicle. 
            ArrayList<Integer> list = vehicles.get(input);

            for (Integer make : list) {
                System.out.println("Name: " + input + " make: " + make);
            }
        }else {
            // if not present, output it.
            System.out.println("Sorry we currently do not have any " + input + " vehicle");
        }
    }
}