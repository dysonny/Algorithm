import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] card = new int[N];
        int sum=0;
        List<Integer> list = new ArrayList<>();

        for (int i=0;i<N;i++) {
            card[i]=sc.nextInt();
        }

        for (int i=0;i<N-2;i++){
            for (int j=i+1;j<N-1;j++){
                for (int k=j+1;k<N;k++){
                    sum=card[i]+card[j]+card[k];
                    if (sum<=M){
                        list.add(sum);
                    }
                    sum=0;
                }
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0));
    }
}