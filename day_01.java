/*
数列排序

        问题描述
        给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
        输入格式
        　第一行为一个整数n。
        　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
        输出格式
        　输出一行，按从小到大的顺序输出排序后的数列。
        样例输入
        5
        8 3 6 4 9
        样例输出
        3 4 6 8 9
*/

import java.util.Scanner;

public class day_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            //读入一个数
            a[i] = sc.nextInt();
            //将这个数插入到一个有序的子数组中
            for (int j = i; j > 0; j--) {
                //已经插入到了合适的位置，可以跳出里层循环
                if (a[j] < a[j - 1]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                } else break;
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
