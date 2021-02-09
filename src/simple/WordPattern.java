package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词规律
 * @author zhoujl
 */
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aaba";
        String s = "good good st good";
        System.out.println(new WordPattern().solution(pattern,s));

    }

    public boolean solution(String pattern, String s) {
        String[] split = s.split(" ");
        if (split.length!=pattern.length()){
            return false;
        }
        Map<Character,String> mapUtil = new HashMap<>();
        for (int i =0;i<split.length;i++){
            char temp = pattern.charAt(i);
            if (mapUtil.get(temp)==null&&!mapUtil.containsValue(split[i])){
                mapUtil.put(temp,split[i]);
            }else{
                if (mapUtil.get(temp)!=null&&mapUtil.get(temp).equals(split[i])){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
