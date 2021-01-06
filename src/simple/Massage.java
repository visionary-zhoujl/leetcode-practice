package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 按摩师
 */
public class Massage {
    public static void main(String[] args) {
        int[] param = new int[]{114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        int result = solution(param);
        System.out.println(result);
    }

    public static int solution(int[] nums){
        int result = -1;
        Map<Integer,Integer> cacheMap = new HashMap<>();



        result = f(nums,nums.length,cacheMap);



        return result;
    }

    public static int f(int[] nums,int n,Map<Integer,Integer> map){
        if (map.containsKey(n)){
            return map.get(n);
        }
        if (n==1){
            map.put(1,nums[0]);
            return map.get(1);
        }
        if (n==0){
            map.put(0,0);
            return map.get(0);
        }
        map.put(n,Math.max(f(nums,n-1,map),f(nums,n-2,map)+nums[n-1]));
        return map.get(n);
    }
}
