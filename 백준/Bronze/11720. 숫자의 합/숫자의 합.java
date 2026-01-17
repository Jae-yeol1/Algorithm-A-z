import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String sNum = br.readLine(); 

        char[] cNum = sNum.toCharArray(); // 문제 조건맞게 CHAR 배열로
        int sum = 0;

       
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // 배열값 전부 더하지만 0은 빼고 정수로변환
        }

        System.out.println(sum);
    }
}