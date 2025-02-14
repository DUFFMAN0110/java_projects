package SortingMethods;

public class MergeSort {
    private int[] nums; 

    public MergeSort(){
        nums = new int[] {10, 25, 6, 2, 44, 9, 30, 28, 70, 50, 55, 80};
    }

    public MergeSort(int[] numbers){
        nums = numbers; 
    }

    public void mergeSort(int[] arr){
        int len = arr.length; 
        int lsize = len/2; 
        int rsize = len - lsize; 
        int[] lArr = new int[lsize]; 
        int[] rArr = new int[rsize]; 

        if(len <= 1){
            return; 
        }
        int o = 0; 
        for(int i = 0; i < len; i++){
          
            if(i < lsize){
                lArr[i] = arr[i]; 
            }else{
                rArr[o] = arr[i]; 
                o++; 
            }
        }

        mergeSort(lArr); 
        mergeSort(rArr); 
        merge(arr,lArr,rArr); 

    }

    public void merge(int[] arr, int[] leftArray, int[] rightArray){

        int i = 0, l = 0, r = 0; 
        int lsize = leftArray.length; 
        int rsize = rightArray.length; 
        while( l < lsize && r < rsize){
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];  
                l++;
                i++; 
            }else if(rightArray[r] < leftArray[l]){
                arr[i] = rightArray[r]; 
                r++; 
                i++;
            }
            
        }
        while(l < lsize){
            arr[i] = leftArray[l]; 
            i++; 
            l++; 
        }
        while(r < rsize){
            arr[i] = rightArray[r]; 
            i++; 
            r++; 
        }
    }


    public String toString(){
        String output = ""; 
        mergeSort(nums); 

        for (int i : nums) {
            output += i + " "; 
        }

        output += "\n"; 
        return output; 
    }
}
