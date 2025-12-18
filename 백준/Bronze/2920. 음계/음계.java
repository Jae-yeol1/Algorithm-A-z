import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iarr = new int[8];

        String str = "";
        // 입력 받기
        for(int i = 0; i < iarr.length; i++){
            iarr[i] = sc.nextInt();
        }
        int ascCount = 0;
        int descCount = 0;

        for (int i = 0; i < iarr.length -1 ; i++) {
            if(iarr[i] < iarr[i+1]){
                ascCount++;
            }else{
                descCount++;
            }
        }
        if (ascCount == 0){
            System.out.println("descending");
        }else if(descCount == 0){
            System.out.println("ascending");
        }else{
            System.out.println("mixed");
        }

    }
}
