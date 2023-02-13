import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N+1];
        int [] dp = new int[N+1];
        int cnt=1;

        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            dp[i]=1;
        }

        for (int i=1;i<N;i++){
            for (int j=0;j<i;j++){
                if (arr[j]<arr[i] && dp[i]<=dp[j]){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int max =0;
        for (int i : dp){
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}