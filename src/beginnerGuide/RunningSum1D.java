package beginnerGuide;

import java.util.Arrays;

public class RunningSum1D {

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] numsSum = new int[nums.length];
        int sum = 0;
        int i = 0;
        for (int num:nums){
            sum +=num;
            numsSum[i]=sum;
            i++;
        }
        return numsSum;
    }

}
