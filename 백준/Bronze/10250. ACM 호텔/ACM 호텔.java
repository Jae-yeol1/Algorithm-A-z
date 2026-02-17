import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int H = Integer.parseInt(st.nextToken()); // 층 
            int W = Integer.parseInt(st.nextToken()); // 사용 안한 방
            int N = Integer.parseInt(st.nextToken()); // 손놈

            int floor;
            int room;

           
            if (N % H == 0) {
                floor = H;          
                room = N / H;       // 방
            } else {
                floor = N % H;      // 나머지 층
                room = (N / H) + 1; // 몫+1 방
            }
            sb.append((floor * 100) + room).append('\n');
        }
        System.out.print(sb);
    }
}