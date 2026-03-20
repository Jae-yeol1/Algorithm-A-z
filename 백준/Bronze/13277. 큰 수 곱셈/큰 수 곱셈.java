import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        
        // 문자열을 BigInteger 객체로 변환
        BigInteger a = new BigInteger(input[0]);
        BigInteger b = new BigInteger(input[1]);
        
        // BigInteger의 multiply 메서드로 큰 수 곱셈 처리
        System.out.println(a.multiply(b));
    }
}