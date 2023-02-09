import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());        // 테스트 케이스의 개수

        int fibo [][] = new int[41][41];    // 0과 1의 호출횟수를 저장할 2차원배열 선언

        // 초기값 설정
        fibo[0][0]=1;       //0일때 0 호출횟수 : 1
        fibo[0][1]=0;       //0일때 1 호출횟수 : 0
        fibo[1][0]=0;       //1일때 0 호출횟수 : 0
        fibo[1][1]=1;       //1일때 1 호출횟수 : 1

        // fibo 배열 안의 값 채우기
        for (int i=2;i<41;i++){
            fibo[i][0]=fibo[i-1][0]+fibo[i-2][0];   // 0 호출횟수에 대한 점화식
            fibo[i][1]=fibo[i-1][1]+fibo[i-2][1];   // 0 호출횟수에 대한 점화식
        }

        for (int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            System.out.printf("%d %d\n" ,fibo[N][0], fibo[N][1]);
        }
    }
}