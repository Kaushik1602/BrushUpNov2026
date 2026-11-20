package arrays;

public class MaxConsecutiveOnes {

    static void main(String[] args) {
       int[] nums = {1,0,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
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
