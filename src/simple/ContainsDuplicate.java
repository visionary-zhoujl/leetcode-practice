package simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 重复元素
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] param = new int[]{1,2,3,4};
        boolean result = solution(param);
        System.out.println(result);
    }

    public static boolean solution(int[] nums){
        Set<Integer> setUtil = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (setUtil.contains(nums[i])){
                return true;
            }else {
                setUtil.add(nums[i]);
            }
        }
        return false;
    }

}
