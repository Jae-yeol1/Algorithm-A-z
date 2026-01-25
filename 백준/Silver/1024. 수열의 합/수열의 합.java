import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());  // 목표 합
        int L = Integer.parseInt(st.nextToken()); // 최소 길이

        // 길이를 L부터 100까지 하나씩 늘리며 가능한지 확인
        for (int length = L; length <= 100; length++) {

            // plusSum = 1 + 2 + ... + (length-1)
            long plusSum = (long) length * (length - 1) / 2;

            // remain = N에서 plusSum을 뺀 값
            // remain = length * start 가 되어야 함
            long remain = N - plusSum;

            // remain이 음수면 start가 음수가 되어버리므로 불가능
            if (remain < 0) continue;

            // remain이 length로 나누어떨어져야 start가 정수
            if (remain % length != 0) continue;

            long start = remain / length; // 시작 값

            // 수열 출력
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(start + i);
                if (i < length - 1) sb.append(" ");
            }

            System.out.print(sb.toString());
            return; // 가장 짧은 길이를 찾았으니 바로 종료
        }

        // 끝까지 못 찾으면 -1
        System.out.print("-1");
    }
}
// 진짜 쉽지않음 AI가 80퍼 완성