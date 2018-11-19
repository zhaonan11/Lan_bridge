//finonacci数列递归算法
//算法好难，加油哈哈！！！
import java.util.Scanner;

public class day_35 {

    public static int f(int n){
        if(n<=1)return 1;
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));

    }
}
