import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		if (minute < 45) {
			hour--; // 45분보다 작으면 1시간을 감소함
			
			minute = 60 - (45 - minute); 
			
			// 00시에서 빼면 23시로 
			if (hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + minute);
		} else {
			
			System.out.println(hour + " " + (minute - 45));
		}
	}
}