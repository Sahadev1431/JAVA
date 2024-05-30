import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.*;
public class HashSetq2 {
    // public static void main(String[] args) {
        
    //     HashSet <String> hs = new HashSet<String>();
    //     Scanner sc = new Scanner(System.in);
    //     while (true)
    //     {
    //         int choice;
    //         System.out.println("1.Add\n2.Remove\n3.Search\n4.Display\n5.Display reverse\n6.Total no\n7.Exit");
    //         System.out.println("Enter choice");
    //         choice = sc.nextInt();
    //         sc.nextLine();
    //         switch (choice)
    //         {
    //             case 1:
    //                 System.out.println("Enter name :");
    //                 String NewName = sc.nextLine();
    //                 if (hs.add(NewName))
    //                 {
    //                     System.out.println(NewName +" added to set");
    //                 }
    //                 else
    //                 {
    //                     System.out.println(NewName+" already present in set");
    //                 }
    //                 break;
    //             case 2:
    //                 System.out.println("Enter name to remove:");
    //                 String RemoveName = sc.nextLine();
    //                 if(hs.remove(RemoveName))
    //                 {
    //                     System.out.println(RemoveName+" removed from set");
    //                 }
    //                 else
    //                 {
    //                     System.out.println(RemoveName+" not present in set");
    //                 }
    //                 break;
    //             case 3:
    //                 System.out.println("Enter name to search:");
    //                 String SearchName = sc.nextLine();
    //                 if(hs.contains(SearchName))
    //                 {
    //                     System.out.println("Present in set");
    //                 }
    //                 else
    //                 {
    //                     System.out.println("Not present in set");
    //                 }
    //                 break;
    //             case 4:
    //                 for (String el : hs)
    //                 {
    //                     System.out.print(el+" ");
    //                 }
    //                 break;
    //             case 5:
    //                 ListIterator <String> iterator = new ArrayList(hs).listIterator(hs.size());
    //                 while (iterator.hasPrevious()) {
    //                     System.out.println(iterator.previous());
    //                 }
    //                 break;

    //             case 6:
    //                 System.out.println("Total no :"+hs.size());
    //                 break;
    //             case 7:
    //                 System.out.println("Exiting");
    //                 sc.close();
    //                 System.exit(0);
    //                 break;
                    
    //             default:
    //                 System.out.println("Invalid choice");
    //         }
    //     }
    // }










    public static void main(String[] args) {
        // Create a LinkedHashSet of names
        LinkedHashSet<String> namesSet = new LinkedHashSet<>();
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Charlie");
        namesSet.add("David");
        namesSet.add("Emma");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\n--- LinkedHashSet Menu ---");
            System.out.println("1. Add a new name");
            System.out.println("2. Remove a name");
            System.out.println("3. Search for a name");
            System.out.println("4. Display all names");
            System.out.println("5. Display all names in reverse order");
            System.out.println("6. Display number of elements in LinkedHashSet");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name to add: ");
                    String newName = scanner.nextLine();
                    if (namesSet.add(newName)) {
                        System.out.println("'" + newName + "' added successfully!");
                    } else {
                        System.out.println("'" + newName + "' already exists in the LinkedHashSet.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the name to remove: ");
                    String removeName = scanner.nextLine();
                    if (namesSet.remove(removeName)) {
                        System.out.println("'" + removeName + "' removed successfully!");
                    } else {
                        System.out.println("'" + removeName + "' not found in the LinkedHashSet.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    if (namesSet.contains(searchName)) {
                        System.out.println("'" + searchName + "' found in the LinkedHashSet.");
                    } else {
                        System.out.println("'" + searchName + "' not found in the LinkedHashSet.");
                    }
                    break;
                case 4:
                    System.out.println("--- All Names in LinkedHashSet ---");
                    for (String name : namesSet) {
                        System.out.println(name);
                    }
                    break;
                case 5:
                    System.out.println("--- All Names in LinkedHashSet (Reverse Order) ---");
                    ListIterator <String> it = new ArrayList(namesSet).listIterator(namesSet.size());
                    while (it.hasPrevious())
                    {
                        System.out.println(it.previous());
                    }
                    break;
                case 6:
                    System.out.println("Number of elements in LinkedHashSet: " + namesSet.size());
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-7).");
            }
        }
    }
}
