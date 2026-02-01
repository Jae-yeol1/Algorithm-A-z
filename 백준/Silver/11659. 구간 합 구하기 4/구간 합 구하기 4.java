import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberCount = Integer.parseInt(st.nextToken());
        int queryCount = Integer.parseInt(st.nextToken());

        // 누적합 배열
        long[] prefix = new long[numberCount + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= numberCount; i++) {
            int curNum = Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i - 1] + curNum;
        }

        // 구간찾기
        for (int i = 0; i < queryCount; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            long rSum = prefix[end] - prefix[start - 1];
            System.out.println(rSum);
        }
    }
}
