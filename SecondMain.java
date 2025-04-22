import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Сумма: " + (a + b));
    }
}
