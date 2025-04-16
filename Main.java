// Main.java

// Name: Ameya Tipnis
// PRN: 23070126012
// Dept: SY-AIML-A1

import java.util.*; // Importing utility classes like Scanner and Exception types

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner object for input
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            // Display menu options
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt(); // Taking user choice
            scan.nextLine(); // Consuming the newline character left after nextInt()

            
