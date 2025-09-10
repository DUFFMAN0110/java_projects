package leet_code_problems_in_java;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args){
        int arrays[] = new int[]{
            3,2,4
        }; 
        
        System.out.println(Arrays.toString(twoSum(arrays, 6)));
    }
    static public int[] twoSum(int[] nums, int target) {
        int indicies[] = new int[2];
        OUTERLOOP: for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indicies[0] = i;
                    indicies[1] = j;
                    break OUTERLOOP;
                }
            }
        }
        return indicies;
    }
}
