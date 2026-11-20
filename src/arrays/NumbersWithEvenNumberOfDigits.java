package arrays;

public class NumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count =0;
        for (int n:nums){
            int i = 0;
            while (n>0){
                i++;
                n/=10;
            }
            System.out.println(i);
            if (i%2 == 0){
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
