import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int [] arr = new int[11];

        // 배열 arr의 초기값 세팅
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;

        // 점화식을 이용해 배열에 값 채우기
        for (int i=4;i<11;i++){
            arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
        }

        for (int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }
    }
}