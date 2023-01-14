import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        int a=1;
        int n=1;

        while(n<N){
            n=n+6*a;
            a++;
        }
        System.out.println(a);
    }
}