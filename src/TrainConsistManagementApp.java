import java.util.ArrayList;
import java.util.List;

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
    }
}