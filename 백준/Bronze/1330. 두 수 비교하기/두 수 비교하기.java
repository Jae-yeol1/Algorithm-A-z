import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println('>');
        }else if( num1 < num2 ){
            System.out.println("<");
        }else{
            System.out.println("==");
        }

    }

    //A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
// A와 B가 같은 경우에는 '=='를 출력한다.
    
}
