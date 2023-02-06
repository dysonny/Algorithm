import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt=0;      // 소수이면 +1씩 할 변수

        for (int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)==true)
                cnt++;
        }
        System.out.println(cnt);
    }
    static boolean isPrime(int n){
        int [] arr = new int[1001];

        arr[0]=arr[1]=0;        // 0,1 은 소수로 처리

        for (int i=2;i<1000;i++)
            arr[i]=i;           // 2~1000까지 배열의 모든 값을 i로 초기화

        for (int i=2;i<1000;i++){
            if (arr[i]==0)
                continue;
            for(int j=i+i;j<1000;j+=i)
                arr[j]=0;           //소수가 아닌 수들은 모두 0으로 처리
        }

        if (arr[n]!=0)          // n값이 소수이면 true를 반환
            return true;
        else
            return false;
    }
}