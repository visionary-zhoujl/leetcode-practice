package simple;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(new MissingNumber().solution(nums));
    }

    public int solution(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int leftIndex = 0;
        int rightIndex = nums.length -1;
        int currentIndex = (leftIndex+rightIndex)/2;
        while (leftIndex<rightIndex){
            if (nums[currentIndex]>currentIndex){
                rightIndex = (currentIndex-1)>0?(currentIndex-1):0;
            }
            if (nums[currentIndex]==currentIndex){
                leftIndex = currentIndex+1;
            }
            currentIndex = (leftIndex+rightIndex)/2;

        }
        if (nums[currentIndex]==currentIndex){
            return currentIndex+1;
        }
        return currentIndex;
    }
}
