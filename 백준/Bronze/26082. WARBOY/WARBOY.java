import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        

        int rivalPrice = Integer.parseInt(st.nextToken());    
        int rivalPerformance = Integer.parseInt(st.nextToken()); 
        int warboyPrice = Integer.parseInt(st.nextToken());      
        
        int result = (rivalPerformance / rivalPrice) * 3 * warboyPrice;
        
        System.out.println(result);
    }
}