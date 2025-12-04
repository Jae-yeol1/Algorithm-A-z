import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   
        StringTokenizer st = new StringTokenizer(br.readLine());

    
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

          // Math 클래스의 절댓값 나타내는 메소드 abs사용함
        System.out.println(Math.abs(n - m));
    }
}