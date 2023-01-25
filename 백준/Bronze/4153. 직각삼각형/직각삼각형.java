import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();

            if (a==0 && b==0 && c==0){          // 0 0 0 이 입력되면 무한루프 break
                break;
            }
            else if (a * a + b * b == c * c || a * a + c * c == b * b ||c * c + b * b == a * a){   // 직각삼각형이면 right
                System.out.println("right");
            }
            else
                System.out.println("wrong");    // 직각삼각형이 아니면 wrong
        }
    }
}