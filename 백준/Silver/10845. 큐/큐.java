import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();  // 큐 선언

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 0;

        for (int i=0;i<N;i++){          // 명령의 수 N
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            if (S.equals("push")){
                a = Integer.parseInt(st.nextToken());
                queue.add(a);           // 정수 a를 입력받고, add로 push
            }
            else if(S.equals("pop"))
                System.out.println(queue.isEmpty() ? -1 : queue.poll());    // 비어있으면 -1, 아니면 poll
            else if(S.equals("size"))
                System.out.println(queue.size());                           // 큐의 size를 출력
            else if(S.equals("empty"))
                System.out.println(queue.isEmpty() ? 1 : 0);                // 비어있으면 1, 아니면 0
            else if (S.equals("front"))
                System.out.println(queue.isEmpty() ? -1 : queue.peek());    // 비어있으면 -1, 아니면 peek
            else if (S.equals("back"))
                System.out.println(queue.isEmpty() ? -1 : a);               // 비어있으면 -1, 아니면 가장 최근에 push한 a값 출력
        }
    }
}
