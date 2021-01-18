package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 * @author zhoujl
 */
public class KidsWithCandies {

    public static void main(String[] args) {
        List<Boolean> list= new KidsWithCandies().solution(new int[]{1,2,3,8},3);
        System.out.println();
    }
    public List<Boolean> solution(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int[] temp = candies.clone();
        Arrays.sort(temp);
        int countable = temp[temp.length-1]-extraCandies;
        for (int i=0;i<candies.length;i++){
            if (candies[i]>=countable){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
