/*
回文数

        问题描述
        1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
        输出格式
        按从小到大的顺序输出满足条件的四位十进制数。
*/

public class day_07 {
    public static void main(String[] args) {
        int count=0;
        for(int n=1000;n<=10000;n++){
            int a = n/1000;                 //a是千位
            int b = (n - a*1000)/100;       //b是百位
            int c = (n - a*1000 - b*100)/10;//c是十位
            int d = (n - a*1000 - b*100)%10;//d是个位
            if(a==d&&b==c){
                System.out.println(n); count++;
            }

        }
        System.out.println(count);

        /*int count=0;
        for (int i = 10; i < 100; i++) {
            int j = i / 10 + (i % 10) * 10;
            if (i % 10 == 0) {
                System.out.println(i + "0" + j);
            } else {
                System.out.println(i + "" + j);
            }
            count++;
        }
      System.out.println(count);*/
    }
}