import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        primeNumber(M,N);

    }
    static void primeNumber(int m, int n){
        int [] arr = new int[n+1];

        for (int i=2;i<=n;i++){
            arr[i]=i;           // 배열 초기화
        }

        for (int i=2;i<=n;i++){
            if (arr[i]==0)
                continue;
            for (int j=i+i;j<=n;j+=i){
                arr[j]=0;
            }
        }

        for (int i=m;i<=n;i++){
            if(arr[i]!=0)
                System.out.println(i);
        }
    }
}