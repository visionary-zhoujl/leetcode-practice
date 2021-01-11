package simple;

import com.sun.tools.javac.util.Assert;
import sun.tools.java.BinaryCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 202. 快乐数
 *「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/happy-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsHappy {
    public static void main(String[] args) {
        Set<Integer> setUtil = new HashSet<>();
        System.out.println(solution(2,setUtil));
    }

    public static boolean solution(int n,Set setUtil){
        if (n==1) {
            return true;
        }
        if (setUtil.contains(n)){
            return false;
        }
        setUtil.add(n);
        int result = 0;
        while (n!=0){
            result +=(n%10) * (n%10);
            n /=10;
        }
        return solution(result,setUtil);
    }
}
