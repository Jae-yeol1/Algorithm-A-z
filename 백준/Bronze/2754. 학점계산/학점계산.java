import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //학점
        String s = br.readLine();

        // F는 바로 종료
        if (s.equals("F")) {
            System.out.println(0.0);
            return;
        }

        double G = 0.0;
        char c = s.charAt(0);
        
        if(c == 'A'){
            G = 4.0;
        }
        else if(c == 'B'){
            G = 3.0;
        }
        else if(c == 'C'){
            G = 2.0;
        }
        else if(c == 'D'){
            G = 1.0;
        }
        
        c = s.charAt(1);
        if (c == '+'){
            G += 0.3;
        }
        else if (c == '-'){
            G -= 0.3;
        }

        System.out.println(G);
    }
}