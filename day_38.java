/*
一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
*/
public class day_38 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000; i++) {
            double x =Math.sqrt(i + 100);
            double y =Math.sqrt( i + 268);
            int xx=(int)x;//强制类型转化
            int yy=(int)y;//强制类型转化
            if (x*x==xx*xx&&y*y==yy*yy)
                System.out.println(i);
        }
    }
}
