import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;

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

        System.out.println();
        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println();
        System.out.println("Initial Train Consist:");
        System.out.println(train);

        train.add(2, "Pantry Car");

        System.out.println();
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(train);

        train.removeFirst();
        train.removeLast();

        System.out.println();
        System.out.println("After Removing First and Last Bogie:");
        System.out.println(train);

        System.out.println();
        System.out.println("UC4 ordered consist operations completed...");

        System.out.println();
        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================");

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println();
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println();
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println();
        System.out.println("UC5 formation setup completed...");
    }
}