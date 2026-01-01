import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생 수
        int N = Integer.parseInt(br.readLine());

        // 줄서있는 학생들 번호
        StringTokenizer st = new StringTokenizer(br.readLine());

        // Stack 자료구조 사용
        Stack<Integer> stack = new Stack<>();

        // 현재 간식 배급순서
        int current = 1;
        // hasMoreTokens() 남은 토큰있나 확인하는 토크나이저 함수
        while (st.hasMoreTokens()) {
            int student = Integer.parseInt(st.nextToken());

            // 현재순서와 상태가 맞으면 상태 ++
            if (student == current) {
                current++;
            }
            // 아니면 스택으로 보내는데 이후 ...?
            else {
                stack.push(student);
            }

            // pop 구현 ...?

        }


        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}