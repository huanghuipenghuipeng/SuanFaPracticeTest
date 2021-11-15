import org.junit.jupiter.api.Test;

public class T11_14 {
        @Test
        public void fun1(){
            System.out.println(romanToInt("LVIII"));
        }
    /**
     * 13. 罗马数字转整数
     */
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int num = 0;
        int i = 0;
        while(i<c.length){
            switch (c[i]) {
                case 'I':
                    if (i + 1 < c.length) {
                        if (c[i + 1] == 'V') {
                            num += 4;
                            i += 2;
                            break;
                        } else if (c[i + 1] == 'X') {
                            num += 9;
                            i += 2;
                            break;
                        }
                    }
                    num += 1;
                    i += 1;
                    break;
                case 'V':
                    num += 5;
                    i += 1;
                    break;
                case 'X':
                    if (i + 1 < c.length) {
                        if (c[i + 1] == 'L') {
                            num += 40;
                            i += 2;
                            break;
                        } else if (c[i + 1] == 'C') {
                            num += 90;
                            i += 2;
                            break;
                        }
                    }
                    num += 10;
                    i += 1;
                    break;
                case 'L':
                    num += 50;
                    i += 1;
                    break;
                case 'C':
                    if (i + 1 < c.length) {
                        if (c[i + 1] == 'D') {
                            num += 400;
                            i += 2;
                            break;
                        } else if (c[i + 1] == 'M') {
                            num += 900;
                            i += 2;
                            break;
                        }
                    }
                    num += 100;
                    i += 1;
                    break;
                case 'D':
                    num += 500;
                    i += 1;
                    break;
                case 'M':
                    num += 1000;
                    i += 1;
                    break;
            }
        }
        return num;
        }




}

