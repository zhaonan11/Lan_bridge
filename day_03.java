/*十六进制转十进制

        问题描述
        从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
        注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
        样例输入
        FFFF
        样例输出
        65535
         */


import java.util.*;

public class day_03 {
    public static void f(String s) {
        int n = 0;
        long sum = 0;
        long m = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);//charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1
            if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F') {
                m = c - '0' - 7;
            } else m = c - '0';
            for (int j = 0; j < n; j++) {
                m = m * 16;
            }
            sum = sum + m;
            n++;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        f(s);
        /*next()和nextLine()的区别详解
        next()方法在读取内容时，会过滤掉有效字符前面的无效字符，
        对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，next()方法会自动将其过滤掉；
        只有在读取到有效字符之后，next()方法才将其后的空格键、Tab键或Enter键等视为结束符；
        所以next()方法不能得到带空格的字符串。
        nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，即nextLine()方法返回的是Enter键之前没有被读取的所有字符，它是可以得到带空格的字符串的。
       */
    }
}
