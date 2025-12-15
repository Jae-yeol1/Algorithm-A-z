import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        char[] carr = input.toCharArray();
        for(int i=0; i<input.length(); i++){
            char c= input.charAt(i);
            // c 가 c의 번호표(아스키 코드)가 소문자 구역(a=97~ z=122번)에 있는지 검사
            if ('a' <= c && c <= 'z') {
                carr[i] = Character.toUpperCase(c);
            } else {
                carr[i] = Character.toLowerCase(c);
            }
        }


        System.out.println(carr);

    }
}