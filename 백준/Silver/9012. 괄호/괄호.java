import java.util.*;

public class Main {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();

        for (int i=0;i<N;i++){
            System.out.println(par(sc.next()));
        }
    }

    public static String par(String a){
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<a.length();i++){         //character의 개수만큼 for문 돌리기
            char c = a.charAt(i);

            if (c=='(')
                stack.push(c);              // "(" 이면, 스택에 넣는다.
            else if (stack.empty())
                return "NO";                // ")"를 입력받았지만, pop할 원소가 없을 경우 return NO (3번경우)
            else
                stack.pop();                // ")"를 입력받으면, pop
        }

        if (stack.empty())
            return "YES";                   // 모든 과정이 끝났는데 empty이면 성공이므로 return YES (1번경우)
        else
            return "NO";                    // 모든 과정이 끝났는데 원소가 남아있으면 실패이므로 return NO (2번경우)
    }
}