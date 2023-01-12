import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt(); // 테스트 케이스의 개수 T

        int a,b;
        int[] result=new int[T];    // 결과값을 저장할 result 배열

        for (int i=0;i<T;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            result[i]=a+b;
        }

        for (int i=0;i<T;i++){
            System.out.println(result[i]);
        }
    }
}