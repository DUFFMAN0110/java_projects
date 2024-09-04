package BudgetingApplication;

import java.util.Scanner;

public class CategoryRunner {
    public static void main(String[] args) {
        System.out.println("Hello");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a category:: ");
            Category category = new Category(sc.nextLine());
            System.out.println(category);
            System.out.print("Is this category valid? (true/false) :: " + category.isValid());
        } catch(Exception e){
            System.out.println("THERE'S A PROBLEM!!!");
        }
    }
}
