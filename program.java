/**
 * program
 */
import java.util.Scanner; // Необходимо для ввода данных с клавиатуры
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
        // int a = 123; // Присваивание значений
        sayHi();
        lib.sayHi(); // Обращение к другому файлу
    }
    static void sayHi(){ // Методы(функции)
        System.out.println("Hi");
    }
}
// Запуск программы можно осуществить с помощью пуск п правом верхнем углу, или записью в терминале
// java *название файла*.java 