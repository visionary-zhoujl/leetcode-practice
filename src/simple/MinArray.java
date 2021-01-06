package simple;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class MinArray {
    public static void main(String[] args) {

        String testStr =" ";
        if(testStr==null||testStr.length()<=0){
            System.out.println("jinle");
        }

        int[] numbers = new int[]{2,2,2,2,2};
        solution(numbers);
    }
    public static int solution(int[] numbers){
        int result = -1;
        if (numbers.length<2){
            return numbers[0];
        }
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]>numbers[i+1]){
                result =  numbers[i+1];
                break;
            }else {
                if (i == numbers.length-1){
                    return numbers[i];
                }

            }
        }
        return result==-1?numbers[0]:result;
    }
}
