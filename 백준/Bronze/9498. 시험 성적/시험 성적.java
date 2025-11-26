import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade;
        
      
        
        if (score >= 90) {
        // 90점 이상 100점 이하
            grade = "A";
            } else if (score >= 80) {
            // 80점 이상 90점 미만
                grade = "B";
                } else if (score >= 70) {
                    // 70점 이상 80점 미만
                        grade = "C";
                    } else if (score >= 60) {
                     // 60점 이상 70점 미만
                        grade = "D";
                        } else {
                         grade = "F";
                        }
        System.out.println(grade);
    }
}