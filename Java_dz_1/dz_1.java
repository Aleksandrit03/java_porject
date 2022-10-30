package Java_dz_1;
import java.util.Scanner;
public class dz_1 {
    
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("Введите значение а: ");
            int a = iScanner.nextInt();
            System.out.printf("Введите значение b: ");
            int b = iScanner.nextInt();
            double c = Math.pow(a,b);
            System.out.printf("a в степени b равно: ");
            System.out.println(c);
        }
    }
}
