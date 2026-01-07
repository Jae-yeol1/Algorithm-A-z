import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 교수님이 지각할 수 있는 최대시간
            int lateTime = Integer.parseInt(br.readLine());

            int lecTure = 1;

            // 수업시간 + 수업시간을 제곱한것이  수업시간을 초과하지 않을때까지만
            while( lecTure + (lecTure*lecTure) <= lateTime){
                lecTure++;
            }
            System.out.println(lecTure - 1);

        }
    }
}
