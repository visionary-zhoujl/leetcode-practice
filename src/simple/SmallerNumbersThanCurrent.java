package simple;

import java.util.Arrays;

/**
 * 1365. 有多少小于当前数字的数字
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 *
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 *
 * 以数组形式返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        System.out.println(Arrays.toString(new SmallerNumbersThanCurrent().solution(nums)));
    }
    public int[] solution(int[] nums) {
        int[] temp = nums.clone();
        int[] result = new int[nums.length];
        Arrays.sort(temp);
        for (int i = 0; i < result.length; i++) {
            int tempIndex = Arrays.binarySearch(temp,nums[i]);
            while (tempIndex>0) {
                if (temp[tempIndex - 1] == temp[tempIndex]) {
                    tempIndex--;
                } else {
                    result[i] = tempIndex;
                    break;
                }
            }
            if (tempIndex==0){
                result[i]=tempIndex;
            }
        }

        return result;
    }
}
