package homework.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionExample1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Collection<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mary");
        names.add("Peter");
        names.add("David");

        System.out.println("Enter a name to check if it is in the list:");
        String name = scanner.nextLine();

        if (names.contains(name)) {
            System.out.println(name + " is on the list");
        } else {
            System.out.println(name + " not listed");
        }


        System.out.print("Enter a name to delete from the list: ");
        if (names.contains(name)) {
            names.remove(name);
            System.out.println(name + " has been deleted");
        } else {
            System.out.println(" there is no " + name + " name in the list");
        }

        System.out.println("Name list:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}