import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; 

// 반드시 다시 풀어보기 LLM 찬스 사용

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input; // 지나가 버리는 데이터를 붙잡아두는 임시 저장소 라고함 이걸 쓰지않으면 br.readLine 이 데이터를 소비하는데
                        //br.readLine()을 호출하는 순간, 커서가 다음 줄로 이동해버린다고함
        
        // br.readLine()이 null이 아닐 때까지 반복 (입력이 끝날 때까지)
        while ((input = br.readLine()) != null) { 
            
            StringTokenizer st = new StringTokenizer(input, " ");
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            if(A == 0 && B == 0) {
                break;
            }
            
            System.out.println(A + B);
        }
    }
}