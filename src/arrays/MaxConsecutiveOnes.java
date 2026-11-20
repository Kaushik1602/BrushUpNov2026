package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxConsecutiveOnes {

    static void main(String[] args) {
       int[] nums = {1,0,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

        String numsStr = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(Arrays.stream(numsStr.split("0")).mapToInt(String::length)
                .max()
                .orElse(0));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int n:nums){
            if (n==1){
                count++;
                max=Integer.max(max,count);
            }else {
                count=0;
            }
        }
        return max;
    }
}
