import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int case1 = (int)(N * 0.78);
        int case2 = (int)(N * 0.956);
        
        System.out.println(case1 + " " + case2);
    }
}