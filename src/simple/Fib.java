package simple;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列
 */
public class Fib {
    public static void main(String[] args) {
        int param = 48;
//        int result = 1;
//        Long res = 2222L;
//        result =  res.intValue();



        int result = solution(param);
        System.out.println(result);
    }

    public static int solution(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        Map<Integer, BigDecimal> cache = new HashMap<>();
        cache.put(0,new BigDecimal(0));cache.put(1,new BigDecimal(1));
        BigDecimal result = getByCache(95,cache);
        result = result.remainder(new BigDecimal(1000000007));
        return result.intValue();
//        return new Long(getByCache(n,cache)%100000007L).intValue();

    }


    public static BigDecimal getByCache(int n, Map<Integer,BigDecimal> cache){
        if (cache.containsKey(n)){
            return cache.get(n);
        }else{
            cache.put(n,getByCache(n-1,cache).add(getByCache(n-2,cache)));
            return cache.get(n);
        }
    }
}
