package simple;

import java.util.Arrays;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 */
public class Exchange {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(solution(nums)));
    }

    public static int[] solution(int[] nums){
        if (nums.length<1){
            return nums;
        }
        int[] result = new int[nums.length];
        int endIndex = result.length-1;
        int startIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                result[endIndex--] = nums[i];
            }else {
                result[startIndex++] = nums[i];
            }
        }
        return result;
    }
}
