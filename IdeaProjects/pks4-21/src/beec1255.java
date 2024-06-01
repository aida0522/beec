import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем количество тестов
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Читаем числа A и B в виде строк
            String A = scanner.next();
            String B = scanner.next();

            // Проверяем, заканчивается ли A на B
            if (A.endsWith(B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }

        scanner.close();
    }
}
