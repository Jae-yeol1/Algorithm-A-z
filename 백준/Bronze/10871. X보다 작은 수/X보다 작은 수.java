import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //st 는 끝난객체 새 입력 받아야함
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr1  = new int[n];

        // 배열에 값
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n ; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < n ; i++){
            if (arr1[i] < x) {
                sb.append(arr1[i]).append(" ");
            }
        }

        System.out.println(sb.toString());

    }
}