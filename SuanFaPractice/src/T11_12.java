import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class T11_12 {
    public static void main(String[] args) {
        System.out.println( isValid("()"));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int i= 0,count = -1;
        char[] c = new char[chars.length];
        while (i!=chars.length){
        switch (chars[i]){
            case '(':
            case '{':
            case '[': c[++count] = chars[i];
                break;
            case ')': if(count == -1 || c[count--]!= '(') return false;break;
            case '}': if(count == -1 || c[count--]!= '{') return false;break;
            case ']': if(count == -1 || c[count--]!= '[') return false;break;
        }
        i++;
        }
        if(count!=-1)
            return false;
        return true;
    }

    public int removeDuplicates(int[] nums) {
            int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[count])
                nums[++count] = nums[i];
        }
        return count+1;
    }

    public int removeElement(int[] nums, int val) {
        int count = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= val)
                nums[++count] = nums[i];
        }
        return count+1;
    }
    @Test
    public void T11_12(){
        System.out.println(strStr("aaa","aaa"));
    }
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();

        int t= 0;
        for (int i = 0; i <= a.length - b.length; i++) {
            t = 0;
            if(a[i] == b[t]){
                if(t == b.length-1)
                    return i;
                for (int j = i+1; j <a.length ; j++) {
                    if(a[j] != b[++t])
                        break;
                    if(t == b.length-1)
                        return i;
                }
            }
        }
        return -1;
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target)
                return i;
        }
        return nums.length;
    }

    /**
     * 14. 最长公共前缀
     */
    @Test
    public void T_11_13(){
        String s= "";
        String a = null;
        System.out.println(s.isEmpty());
        System.out.println(a.isEmpty());

//        String[] strs = {""};
//        char[] a = new char[3];
//        a[0] = '1';
//        System.out.println(a.length);
//        for (int i = 0; a[i]!='\0'; i++) {
//            System.out.print(a[i]);
//        }
//        System.out.println(longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0]; // **
        char[] chars = is(strs[0].toCharArray(), strs[1].toCharArray());
        for (int i = 2; i < strs.length; i++) {
            chars = is(chars, strs[i].toCharArray());
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!='\0')
                count++;
        }
        if (count == 0)
            return "";  //
        return new String(chars,0,count);   // **  不然会有\\u000\\u000

    }

    public char[] is(char[]c1,char c2[]){
        int i = 0,j = 0,count = 0;
        char [] c3 = new char[c1.length];
        while (i<c1.length && j<c2.length){
            if(c1[i]!=c2[j])
                break;
            c3[count++] = c1[i];
            i++;j++;
        }
        return c3;
    }


}

