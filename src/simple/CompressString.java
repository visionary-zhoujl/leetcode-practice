package simple;

import java.util.*;

/**
 * 字符串压缩
 */
public class CompressString {
    public static void main(String[] args) {
        String param = "aabbccaaa";
        String result = solution(param);
        System.out.println(result);
    }

    public static String solution(String s){
        StringBuffer result = new StringBuffer();
        int count = 1;
        char lastChar;
        char nextChar = '1';
        if (s!=null&&s.length()>1){
            lastChar=s.charAt(0);
        }else{
            return s;
        }
        for (int i=1;i<s.length();i++){
            nextChar = s.charAt(i);
            if (nextChar == lastChar){
                count ++;
            }else{
                result.append(lastChar).append(count);
                count =1;
                lastChar = nextChar;
            }
        }
        result = nextChar=='1'?result:result.append(nextChar).append(count);
        return result.toString().length()<s.length()? result.toString() : s;
    }
}
