package Testing_Java;
import java.util.Arrays;

public class SortNums {


    private int[] pre;
    private String str;
    private int[] post; 
    private boolean unsorted = true;
    public SortNums(){}

    public SortNums(int[] nums)
    {
        post = Arrays.copyOf(nums, nums.length); 
        pre = nums; 
    }

    public void sort() // sorts the array from least to greatest, left to right
    {
        int length = pre.length; 
        do
        {
            for(int i = 1; i < length ; i++)
            {
                int left = pre[i-1]; 
                int right = pre[i]; 
                if(left > right)
                { 
                    post[i-1] = right;
                    post[i] = left;
                    unsorted = true; 
                } 
                length--;
            }
        }while(unsorted);
    }
    public void sortBackwards(){}
    public String toString()
    {
        String output = Arrays.toString(post);  
        sort(); 
        return output; 
    }

}
