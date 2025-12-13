import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 구라면 빼내는 로직생각..
        boolean[] visited = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(br.readLine());
            // 들어온 visited 여기에 true 로 바꿈
            visited[num] = true;
        }
        for (int i = 1; i <= 30; i++) {
            // 체크 안된부분만 출력
            if (!visited[i]) {
                System.out.println(i);
            }
        }



    }
}