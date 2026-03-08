import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String smupc = "WelcomeToSMUPC";

        int index = (n - 1) % 14;
        
        System.out.println(smupc.charAt(index));
    }
}