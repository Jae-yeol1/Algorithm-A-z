import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tcCount = sc.nextInt();

        for (int i = 0; i < tcCount; i++) {
            String resultString = sc.next();
            char[] rArr = resultString.toCharArray();

            int totalScore = 0;
            int count = 0;

            for (int j = 0; j < rArr.length; j++) {
                if (rArr[j] == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                totalScore += count;
            }

            System.out.println(totalScore);
        }
    }
}
