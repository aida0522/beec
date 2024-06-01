import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(); // Высота исходного рисунка
            int m = scanner.nextInt(); // Ширина исходного рисунка

            if (n == 0 && m == 0) {
                break;
            }

            // Чтение исходного рисунка
            char[][] drawing = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = scanner.next();
                for (int j = 0; j < m; j++) {
                    drawing[i][j] = line.charAt(j);
                }
            }

            int a = scanner.nextInt(); // Новая высота рисунка
            int b = scanner.nextInt(); // Новая ширина рисунка

            // Вывод измененного рисунка
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(drawing[i % n][j % m]);
                }
                System.out.println();
            }

            System.out.println(); // Пустая строка между рисунками
        }

        scanner.close();
    }
}
