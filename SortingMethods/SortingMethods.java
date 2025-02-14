package SortingMethods;

// import java.util.ArrayList; 

public class SortingMethods{
    public static void main(String[] args){
        int k[] = new int[] {12,6,15,1,3,7,2,8,4,40,300,200,198,156,160,165,280,290,800,876,123,321,231,312,234,432}; 

        MergeSort m = new MergeSort(k); 
        // BubbleSort b = new BubbleSort();

        // System.out.println(b);
        System.out.println(m);
        
        
    }
}


