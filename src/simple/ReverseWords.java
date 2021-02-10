package simple;

/**
 *557. 反转字符串中的单词 III
 * @author zhoujl
 */
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(new ReverseWords().solution("Let's take LeetCode contest"));
    }
    public String solution(String s) {
        if (s==null||s.isEmpty()){
            return s;
        }
        String[] splits = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String split : splits) {
            sb.append(new StringBuilder(split).reverse());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
