import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class T10 {
    public static void main(String[] args) {
        int num[] = {1,2,3};
        int[] concatenation = getConcatenation(num);
        for (int i = 0; i < concatenation.length; i++) {
            System.out.print(
                    concatenation[i]
            );
        }
    }
    public static int[] getConcatenation(int[] num) {

        int ans[] = new int[num.length*2];

        for (int i = 0; i < num.length; i++) {
            ans[i] = num[i];
        }
        for (int i = num.length; i <num.length*2 ; i++) {
            ans[i] = num[i-num.length];
        }
        return ans;
    }
    @Test
    public void D1_11(){
        /**
         * 495. 提莫攻击
         */
        int a[] = {1,4};

        System.out.println(  findPoisonedDuration(a,2));
    }
    @Test

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        /**
         * 495. 提莫攻击
         */
        int a[] = {1,4};
        int count = 0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            if((timeSeries[i] + duration) <= timeSeries[i+1]){
                count+=duration;
            }else{
                count+=(timeSeries[i+1] - timeSeries[i]);
            }
        }
        count+=duration;
        return count;
    }
    @Test
    public int[] D11_11(int[] nums, int target) {
        /**
         * 1. 两数之和
         */
        int [] b= new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1 ; j <nums.length ; j++) {
                if(nums[i] + nums[j] == target){
                    b[0] = i;
                    b[1] = j;
                    break;
                }
            }
        }
        return b;
    }
    @Test
    public void fun(){
        System.out.println( reverse(1534236469
        ));
    }

    /**7. 整数反转
     *
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int reverse(int x) {
        long a = 0;
        while (x!=0){
            a = a*10 + x%10;
            x/=10;
        }
        return (int)a == a? (int)a:0;
    }
    @Test
    public void fun1(){
        System.out.println(isPalindrome(-121));
    }

    /**9. 回文数
     *
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     *
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/palindrome-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int b = 0 ;
        int c = x;
        while(x!=0){
            b =b*10 +x%10;
            x/=10;
        }
        return b==c;
    }

    /**
     * github测试
     */

    /**
     * 正常合并
     */
    /////////////////////
    //master变化
    //hotfix变化
    // test。。。。。。。。。。。
    
    //pull测试

    //push测试
}
