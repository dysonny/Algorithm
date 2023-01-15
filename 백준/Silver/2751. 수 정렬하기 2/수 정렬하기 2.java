import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);     // Collections.sort()는 Tim Sort 를 수행한다. ( O(n) ~ O(nlogn) )

        for(int value : list) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);     // 츨력으로 StringBuilder를 사용하면, 속도도 빠르고 부하가 적다.
    }
}