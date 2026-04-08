import java.util.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("====================================");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));

        System.out.println();
        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        bogieList.sort((b1, b2) -> b1.capacity - b2.capacity);

        System.out.println();
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();
        System.out.println("UC7 sorting completed...");
    }
}