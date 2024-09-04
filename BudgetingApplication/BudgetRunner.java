package BudgetingApplication;
import java.util.*; 
import java.io.FileWriter; 
import java.io.File; 
import java.io.IOException;
public class BudgetRunner {
    /*
     * At present moment, I do not know how to overwrite files but the code roughly works?
     */
    public static void main(String[] args) throws IOException{
        // Scanner kb = new Scanner(System.in); 
        // System.out.print("Enter a budget category :: ");
        // String cat1 = kb.nextLine(); 
        // System.out.print("Enter how much you have spent so far :: ");
        // double amt1 = kb.nextDouble(); 
        // System.out.printf(cat1 + " :: $ %.2f\n", amt1);
        // kb.close(); 
        // System.out.print("End of Program.");
        // File budgetTracker = new File("C:\\Users\\josep\\OneDrive\\repos\\java_projects\\BudgetingApplication\\BudgetTracker.txt");
        
        
        BudgetRunner br = new BudgetRunner(); 


        Scanner kb = new Scanner(System.in); 
        // File f = new File("C:\\Users\\josep\\OneDrive\\repos\\java_projects\\BudgetingApplication\\BudgetTracker.txt");
        // if(!f.exists() && f.isDirectory()){
        //     FileWriter filewriter = new FileWriter(f);
        // }
        FileWriter filewriter = new FileWriter("C:\\Users\\josep\\OneDrive\\repos\\java_projects\\BudgetingApplication\\BudgetTracker.txt"); 
        
        ArrayList<Double> currentSpent = new ArrayList<>();
        //fill slots with 0; 
        if(currentSpent.isEmpty()){
            for(int i = 0; i < 7; i++){
                currentSpent.add(0.0);
            }
        }

        // ArrayList<Integer> amtSpentUtilities = new ArrayList<>();         
        
        String schoice, samt; 
        int choice;
        double nextAmt; 
        
        
        
        do{
            br.displayMenu(); 
            
            System.out.print("\n\nChoice:: ");
            schoice = kb.next(); 
            
            
            while(schoice.matches("[A-Za-z]*")){
                System.out.print("Invalid Input.\nChoice:: ");
                schoice = kb.next(); 
            }
            
                if(schoice.length() > 1){
                    choice = Integer.parseInt(schoice.substring(0,1)); 
                }else{
                    choice = Integer.parseInt(schoice);  
                }
                
            switch(choice){
                case 1: 
                    System.out.print("Enter Amount Spent on Utilities:: $");
                    samt = kb.next(); 
    
                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next(); 
                    }
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(0, currentSpent.get(0) + nextAmt); 

                    break; 
                case 2:
                    System.out.print("Enter Amount Spent on Groceries:: $");
                    samt = kb.next(); 
            
                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next();
                    }
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(1, currentSpent.get(1) + nextAmt); 

                    break; 
                case 3:
                    System.out.print("Enter Amount Spent on Transportation:: $"); 
                    samt = kb.next();

                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next();
                    }
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(2, currentSpent.get(2) + nextAmt); 

                    break; 
                case 4: 
                    System.out.print("Enter Amount Spent on Clothing:: $");
                    samt = kb.next(); 

                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next(); 
                    }
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(3, currentSpent.get(3) + nextAmt); 

                    break; 
                case 5: 
                    System.out.print("Enter Amount Spent on Rent:: $");
                    samt = kb.next(); 
                    
                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next(); 
                    }
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(4, currentSpent.get(4) + nextAmt); 

                    break;  
                case 6: 
                    System.out.print("Enter Amount Spent on Subscriptions: $");
                    samt = kb.next(); 
    
                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next();
                    }
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(5, currentSpent.get(5) + nextAmt); 

                    break;
                case 7: 
                    System.out.print("Enter Amount Spent on Miscellaneous:: $");
                    samt = kb.next(); 
                   
                    while(samt.matches("[A-Za-z]*")){
                        System.out.print("Invalid amount.\nInput a new Amount:: $");
                        samt = kb.next();
                    };
                    nextAmt = Double.parseDouble(samt); 

                    currentSpent.set(6, currentSpent.get(6) + nextAmt); 

                    break; 
                }
        }while(choice > 0 && choice <= 7); 

        filewriter.write("1. Utilities:: $" + currentSpent.get(0)+ "\n");
        filewriter.write("2. Groceries:: $" + currentSpent.get(1)+ "\n"); 
        filewriter.write("3. Transportation:: $" + currentSpent.get(2)+ "\n"); 
        filewriter.write("4. Clothing:: $" + currentSpent.get(3)+ "\n"); 
        filewriter.write("5. Rent:: $" + currentSpent.get(4)+ "\n"); 
        filewriter.write("6. Subscriptions:: $" + currentSpent.get(5)+ "\n"); 
        filewriter.write("7. Miscellaneous:: $" + currentSpent.get(6)+ "\n"); 
        filewriter.close(); 
        System.out.println("File has been written");


    }   

    public void displayMenu(){
        System.out.println("Choose A Category to input your Amount Spent::\n");
        System.out.println("1. Enter Amount Spent on Utilities?");
        System.out.println("2. Enter Amount Spent on Groceries?");
        System.out.println("3. Enter Amount Spent on Transportation?");
        System.out.println("4. Enter Amount Spent on Clothing?");
        System.out.println("5. Enter Amount Spent on Rent?");
        System.out.println("6. Enter Amount Spent on Subscriptions?");
        System.out.println("7. Enter Amount Spent on Miscellaneous?");
        System.out.print("0. Exit Program?"); 
    }
}
