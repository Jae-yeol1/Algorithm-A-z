import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] iarr = new int[9];
        int max = 0;
        int index = 0;
        
        for (int i = 0; i < 9; i++) {
            iarr[i] = Integer.parseInt(br.readLine()); // 지역선언해서 속도 높이기
           
            if (iarr[i] > max) {
                max = iarr[i];
                index = i + 1; // 이용우식 비교
            }
        }
        
        System.out.println(max);
        System.out.println(index);
        
    }
}