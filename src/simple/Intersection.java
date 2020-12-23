package simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组交集
 */
public class Intersection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean once = set.add(1);
        boolean twice = set.add(1);

        int[] num1 = new int[]{1,2,2,1};
        int[] num2 = new int[]{2,2};
        int[] result = solution(num1,num2);
        System.out.println();
    }

    public static int[] solution(int[] nums1, int[] nums2){
        int index = 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int i=0;i<nums1.length;i++){
            boolean flag= set.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            boolean flag = set.contains(nums2[i]);
            if (flag){
                resultSet.add(nums2[i]);
            }
        }
        int[] result = new int[resultSet.size()];
        for (Integer temp:resultSet) {
            result[index++]=temp;
        }
        return  result;
    }
}
