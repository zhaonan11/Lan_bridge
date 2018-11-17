/*
十六进制转十进制

        问题描述
        从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
        注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
        样例输入
        FFFF
        样例输出
        65535
*/


import java.util.Scanner;

public class day_04 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long sum = 0;
        int t = 0;
        char[] c = s.toCharArray();//toCharArray() 方法将字符串转换为字符数组
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case '0':
                    t = 0;
                    break;
                case '1':
                    t = 1;
                    break;
                case '2':
                    t = 2;
                    break;
                case '3':
                    t = 3;
                    break;
                case '4':
                    t = 4;
                    break;
                case '5':
                    t = 5;
                    break;
                case '6':
                    t = 6;
                    break;
                case '7':
                    t = 7;
                    break;
                case '8':
                    t = 8;
                    break;
                case '9':
                    t = 9;
                    break;
                case 'A':
                    t = 10;
                    break;
                case 'B':
                    t = 11;
                    break;
                case 'C':
                    t = 12;
                    break;
                case 'D':
                    t = 13;
                    break;
                case 'E':
                    t = 14;
                    break;
                case 'F':
                    t = 15;
                    break;
            }
            sum += (Math.pow(16, c.length - 1 - i) * t);
        }
        System.out.println(sum);
    }
}

        /*next()和nextLine()的区别详解
        next()方法在读取内容时，会过滤掉有效字符前面的无效字符，
        对输入有效字符;之前遇到的空格键、Tab键或Enter键等结束符，next()方法会自动将其过滤掉；
        只有在读取到有效字符之后，next()方法才将其后的空格键、Tab键或Enter键等视为结束符；
        所以next()方法不能得到带空格的字符串。
        nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，即nextLine()方法返回的是Enter键之前没有被读取的所有字符，它是可以得到带空格的字符串的。
       */



