import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // sc라는 scanner 객체 생성

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // 이분탐색 하려면 탐색의 대상이 정렬되어 있어야 함.

        int M = sc.nextInt();
        for (int i=0;i<M;i++){
            int a = sc.nextInt();
            int low=0, high=N-1;
            int result=0;

            while (low<=high){
                int mid=(low+high)/2;

                if (arr[mid]==a){   //입력받은 a값이 중앙값과 같을때
                    result++;
                    break;
                }
                if (arr[mid]>a)     //입력받은 a값이 중앙값보다 작을때
                    high=mid-1;
                else                // 입력받은 a값이 중앙값보다 클때
                    low=mid+1;
            }
            System.out.println(result);
        }

        //이분 탐색 Binary Search를 이용하여 풀이




    }
}