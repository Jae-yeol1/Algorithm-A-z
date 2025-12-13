import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int x = Integer.parseInt(br.readLine());

        int[] arr1  = new int[x];

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열에 값
        for (int i = 0 ; i < x ; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        // 찾을거
        int y = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0 ; i < x ; i++){
            if (arr1[i] == y){
                count++;
            }
        }
        System.out.println(count);




    }
}