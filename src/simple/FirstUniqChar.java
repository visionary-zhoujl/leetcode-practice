package simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 387. 字符串中的第一个唯一字符
 * @author zhoujl
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().solution("loveleetcode"));
    }

    public int solution(String s) {
        if (s==null||s.isEmpty()){
            return -1;
        }
        char[] chars = s.toCharArray();
        Set<Character> setUtil = new HashSet<>();
        for (char temp : chars){
            if (setUtil.contains(temp)){
                continue;
            }
            String s1 = String.valueOf(temp);
            int i = s.indexOf(s1);
            if (i==chars.length-1){
                return i;
            }
            int j = s.indexOf(s1,i+1);
            if (j==-1){
                return i;
            }
            setUtil.add(temp);
        }

        return -1;
    }
}
