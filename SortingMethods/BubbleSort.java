package SortingMethods; 

// import java.util.ArrayList; 

public class BubbleSort{
    int[] nums; 
    
    public BubbleSort(){
        // nums = new int[] {4,12,6,5,2,1};
        nums = new int[] {1,2,3,4,5,6,7};
    }

    public void bubbleSort(int[] arr){
         
       for(int i = 0; i < arr.length - 1; i++){
                for(int j = 0; j < arr.length - 1; j++){
                    
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j]; 
                        arr[j] = arr[j+1]; 
                        arr[j+1] = temp;   
                    }
                    
                }
            } 
    }
    public String toString(){
        String out = ""; 
        bubbleSort(nums);

        for (int i : nums) {
            out += i + " "; 
        }
        
        return out; 
    }
}