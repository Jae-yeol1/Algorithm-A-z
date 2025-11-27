import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫번째줄 정수
        int N = Integer.parseInt(br.readLine());
        
        // 둘째 줄 문제조건 "둘째 줄에는 정수가 공백으로 구분되어져있다"
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 입력받은 크기만큼 크기할당
        int[] num1 = new int[N]; 
        for(int i = 0 ; i < N ; i++ ){
            num1[i] = Integer.parseInt(st.nextToken());
        }
        
        // 3. readLine은 메소드
        int v = Integer.parseInt(br.readLine()); 

        int count = 0;
        for(int i = 0 ; i < N; i++){
            if(num1[i] == v){
                count++;
            }
        }

        System.out.println(count);
    }
}