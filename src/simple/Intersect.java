package simple;

import java.util.*;

/**
 * 获取两个数组的交集
 * @author zhoujl
 */
public class Intersect {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Intersect().solution(
                new int[]{3,3,3,3},new int[]{2,3,3,3}
        )));
    }

    public int[] solution(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i =0;i<nums1.length;i++){
            if (map1.containsKey(nums1[i])){
                map1.put(nums1[i],map1.get(nums1[i])+1);
            }else {
                map1.put(nums1[i],1);
            }
        }
        for (int i =0;i<nums2.length;i++){
            if (map2.containsKey(nums2[i])){
                map2.put(nums2[i],map2.get(nums2[i])+1);
            }else {
                map2.put(nums2[i],1);
            }
        }

        List<Integer> list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entrySet = map1.entrySet();
        for (Map.Entry<Integer,Integer> entry:entrySet) {
            if (map2.containsKey(entry.getKey())){
                for (int i=0;i<Math.min(entry.getValue(),map2.get(entry.getKey()));i++){
                    list.add(entry.getKey());
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
