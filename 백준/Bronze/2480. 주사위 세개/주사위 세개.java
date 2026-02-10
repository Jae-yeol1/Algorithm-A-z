import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = 0;
        
        if (a == b && b == c) {
            // 세 주사위의 모두 같은경우
            d = 10000 + a * 1000;
        } else if (a == b || a == c) {
            d = 1000 + a * 100;
        } else if (b == c) {
            // 두 개의 주사위의 눈이 같을 때 다른경우
            d = 1000 + b * 100;
        } else {
            // 다 다를때
            int max = Math.max(a, Math.max(b, c));
            d = max * 100;
        }
        
        System.out.println(d);
    }
}