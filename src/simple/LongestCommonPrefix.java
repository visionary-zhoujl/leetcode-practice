package simple;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] params = {"flower","flow","flight"};
        System.out.printf(solution(params));
    }

    public static String solution(String[] strs){

        String result = null;
        if (strs!=null&&strs.length>0){
            result = strs[0];
            for (int i = 1;i<strs.length;i++){
                result = getLongestCommonPrefix(result,strs[i]);
                if (result=""){

                }
            }
        }
        return result;
    }


    public static String getLongestCommonPrefix(String s1,String s2){
        if (s1==null||s2==null){
            return null;
        }
        int minSize = s1.length()<s2.length()?s1.length():s2.length();
        for (int i=0;i<minSize;i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0,i);
            }
        }
        return s1.substring(0,minSize);
    }
}
