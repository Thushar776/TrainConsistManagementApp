import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println();
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        String key = "BG309";
        boolean found = false;

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Bogie " + key + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + key + " NOT found.");
        }

        System.out.println();
        System.out.println("UC19 search completed...");
    }
}