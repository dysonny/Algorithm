import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a=0;
        int b=0;

        for (int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push_front")){
                a = Integer.parseInt(st.nextToken());
                dq.addFirst(a);
            }
            else if (s.equals("push_back")){
                b= Integer.parseInt(st.nextToken());
                dq.addLast(b);
            }
            else if (s.equals("pop_front")){
                System.out.println(dq.isEmpty() ? -1 : dq.removeFirst());
            }
            else if (s.equals("pop_back")){
                System.out.println(dq.isEmpty() ? -1 : dq.removeLast());
            }
            else if (s.equals("front")){
                System.out.println(dq.isEmpty() ? -1 : dq.peekFirst());
            }
            else if (s.equals("back")){
                System.out.println(dq.isEmpty() ? -1 : dq.peekLast());
            }
            else if (s.equals("size")){
                System.out.println(dq.size());
            }
            else if (s.equals("empty")){
                System.out.println(dq.isEmpty() ? 1 : 0);
            }


        }
    }
}