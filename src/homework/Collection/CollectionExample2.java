package homework.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter name " + i + ":");
            String name = scanner.nextLine();
            names.add(name);
        }

        ArrayList<String> uniqueNames = new ArrayList<String>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        System.out.println("List of names " + uniqueNames);

        names.clear();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter name " + i + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        Collections.sort(names);
        System.out.println("Sorted list of names: " + names);
    }
}
