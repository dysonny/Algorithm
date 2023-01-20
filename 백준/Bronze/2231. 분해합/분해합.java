import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M=0;      // M의 분해합은 N

        for (int i=0;i<N;i++){  // 0부터 N까지의 수를 서칭
            int num=i;
            int sum=0;          // sum에 합을 저장

            while(num != 0){    // 더 이상 num을 못 나눌때 까지
                sum += num%10;
                num/=10;
            }

            // 생성자를 찾았을 경우
            if (sum+i == N){
                M=i;            // M에 i값을 저장
                break;
            }
        }

        System.out.println(M);
    }
}