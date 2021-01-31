package simple;

import java.util.Arrays;

/**
 * 1103. 分糖果 II
 * @author zhoujl
 */
public class DistributeCandies {

    public static void main(String[] args) {
       // System.out.println(new DistributeCandies().latestNum(100));
        System.out.println(Arrays.toString(new DistributeCandies().solution(1,1)));
    }
    public  int[] solution(int candies, int num_people) {
        int maxCount = latestNum(candies);
        int[] result = new int[num_people];
        for (int i = 0;i<result.length;i++){
            result[i] = getNum(i,result.length,maxCount);
        }
        if (candies-maxCount*(maxCount+1)/2>0){
            result[maxCount%num_people] += candies-maxCount*(maxCount+1)/2;
        }
        return result;
    }

    private int getNum(int i, int length, int maxCount) {
        int sum = 0;
        while (i<maxCount){
            sum = sum + i +1;
            i = length+i;
        }
        return sum;
    }

    public int latestNum(int candies){
        int n=1;
        while (n*(n+1)/2<=candies) {
            n++;
        }
        return n-1;
    }
}
