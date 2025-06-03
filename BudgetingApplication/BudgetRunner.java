package BudgetingApplication;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BudgetRunner {

    private static final String FILE_PATH = "C:\\Users\\josep\\OneDrive\\repos\\java_projects\\BudgetingApplication\\BudgetTracker.txt";
    private static final int CATEGORY_COUNT = 7;
    private static final String[] CATEGORY_NAMES = {
        "Utilities", "Groceries", "Transportation", 
        "Clothing", "Rent", "Subscriptions", "Miscellaneous"
    };
    
    public static void main(String[] args) throws IOException{
        
        // This was an older test of getting input from the terminal input

            // Scanner kb = new Scanner(System.in); 
            // System.out.print("Enter a budget category :: ");
            // String cat1 = kb.nextLine(); 
            // System.out.print("Enter how much you have spent so far :: ");
            // double amt1 = kb.nextDouble(); 
            // System.out.printf(cat1 + " :: $ %.2f\n", amt1);
            // kb.close(); 
            // System.out.print("End of Program.");
        
        Scanner kb = new Scanner(System.in); 
        ArrayList<Double> currentSpent = new ArrayList<>(); 
        // fill with zeros
        for(int i = 0; i < CATEGORY_COUNT; i++){
            currentSpent.add(0.0); 
        }

        Path path = Paths.get(FILE_PATH);
        if (!Files.exists(path)) {
            System.out.println("Budget file does not exist. A new one will be created.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null && index < CATEGORY_COUNT) {
                int dollarIndex = line.indexOf("$");
                if (dollarIndex != -1) {
                    String amountStr = line.substring(dollarIndex + 1).trim();
                    try {
                        double amount = Double.parseDouble(amountStr);
                        currentSpent.set(index, amount);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number in file for " + CATEGORY_NAMES[index]);
                    }
                }
                index++;
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        int choice;
        do{
            displayMenu();
            choice = getIntInput(kb, "Choice:: ", 0, CATEGORY_COUNT);
            if (choice >= 1 && choice <= CATEGORY_COUNT) {
                double amount = getDoubleInput(kb, "Enter Amount Spent on " + CATEGORY_NAMES[choice - 1] + " :: $");
                currentSpent.set(choice - 1, currentSpent.get(choice - 1) + amount);
            }
        }while(choice != 0); 

        // writeToFile(); 
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            for (int i = 0; i < CATEGORY_COUNT; i++) {
                writer.write((i + 1) + ". " + CATEGORY_NAMES[i] + ":: $" + String.format("%.2f", currentSpent.get(i)) + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Budget saved successfully.");
        kb.close();
    }   
    
    private static int getIntInput(Scanner scanner, String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            String line = scanner.next();
            try {
                input = Integer.parseInt(line);
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
        return input;
    }

    public static void displayMenu(){
        System.out.println("Choose A Category to input your Amount Spent::\n");
        for(int i = 0; i < CATEGORY_COUNT; i++){
            System.out.println((i+1) + ". Enter Amount Spent on " + CATEGORY_NAMES[i] + "?");
        }
        System.out.println("0. Exit Program?"); 
    }

    private static double getDoubleInput(Scanner scanner, String prompt) {
        double input;
        while (true) {
            System.out.print(prompt);
            String line = scanner.next();
            try {
                input = Double.parseDouble(line);
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive amount.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Try again.");
            }
        }
        return input;
    }
}
