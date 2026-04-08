import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        List<String> consist = new ArrayList<>();

        System.out.println();
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + consist.size());
        System.out.println("Current Train Consist : " + consist);
        System.out.println();
        System.out.println("System ready for operations...");

        System.out.println();
        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println();
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println();
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        System.out.println();
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        System.out.println();
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println();
        System.out.println("UC2 operations completed successfully...");

        System.out.println();
        System.out.println("====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("====================================");

        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println();
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println();
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println();
        System.out.println("UC3 uniqueness validation completed...");
    }
}