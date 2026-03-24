import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wavelength = sc.nextInt();
        
        if (wavelength >= 620) {
            System.out.println("Red");
        } else if (wavelength >= 590) {
            System.out.println("Orange");
        } else if (wavelength >= 570) {
            System.out.println("Yellow");
        } else if (wavelength >= 495) {
            System.out.println("Green");
        } else if (wavelength >= 450) {
            System.out.println("Blue");
        } else if (wavelength >= 425) {
            System.out.println("Indigo");
        } else if (wavelength >= 380) {
            System.out.println("Violet");
        }
        
    }
}