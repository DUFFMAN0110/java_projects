package BudgetingApplication;

//This will check the different categories 

public class Category {
    
    private String category; 
    public Category(){
        setCategory("");
        // should set all variables
    }
    
    // checks if the category input is a valid category
    // probably implement some sort of gibberish detector
    // have a way to create a new valid category, maybe make it an ArrayList, that continually adds to the strings 
    public Category(String cat){
        setCategory(cat); 
    }


    public void setCategory(String cat){
        category = cat; 
    }


    public String getCategory(){
        return category; 
    }


    public boolean isValid(){
        //probably needs some sort of loop / if statement that checks the type
        String str = "Food,Entertainment,Misc,Rent,Eating Out"; 
        String[] cats = str.toLowerCase().split(","); 
        String thisCat = getCategory().toLowerCase(); 
        for (String c : cats)    
        {
            if(thisCat.equals(c)){
                return true; 
            }
        }
        return false; 
    }


    public String toString(){
        return getCategory(); 
    }
}
