import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int iarr[] = new int[n];
		
		for(int i=0; i < iarr.length; i++) {
			iarr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int min = iarr[0];
		int max = iarr[0];
		
		for(int i=0; i < iarr.length; i++) {
			
			if(iarr[i]>max) max = iarr[i];
            
			if(iarr[i]<min) min = iarr[i];
		}
		System.out.println(min+" "+max);
		
	}
}