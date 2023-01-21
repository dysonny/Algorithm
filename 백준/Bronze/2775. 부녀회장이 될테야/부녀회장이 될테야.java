import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());        // Test Case의 수 T
        int arr[][] = new int[15][15];                  // 15 by 15 의 배열을 생성

        //arr의 초기값 세팅
        for (int i=0;i<15;i++){
            arr[i][0]=1;
            arr[0][i]=i+1;
        }

        // 계약 조항에 따른 2중 for문 구성
        for (int j=1;j<15;j++){
            for (int k=1;k<15;k++){
                arr[j][k]= arr[j-1][k]+arr[j][k-1];
            }
        }

        // k층 n-1 호의 사람수를 찾으면 된다. (0층부터 존재 / 1호부터 존재하기 때문에)
        for (int i=0;i<T;i++){
            int k= Integer.parseInt(br.readLine());
            int n= Integer.parseInt(br.readLine());
            System.out.println(arr[k][n-1]);
        }

    }

}