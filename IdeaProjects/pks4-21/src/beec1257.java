import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем количество тестовых случаев
        int n = scanner.nextInt();
        scanner.nextLine(); // Пропускаем остаток строки после числа

        for (int i = 0; i < n; i++) {
            // Читаем количество строк в текущем тестовом случае
            int L = scanner.nextInt();
            scanner.nextLine(); // Пропускаем остаток строки после числа

            int hash = 0;
            for (int j = 0; j < L; j++) {
                String line = scanner.nextLine();
                for (int k = 0; k < line.length(); k++) {
                    char c = line.charAt(k);
                    int alphabetPosition = c - 'A'; // Позиция символа в алфавите (0-25)
                    int elementPosition = j; // Позиция элемента (строки)
                    int characterPosition = k; // Позиция символа в строке
                    int value = alphabetPosition + elementPosition + characterPosition;
                    hash += value;
                }
            }

            System.out.println(hash);
        }

        scanner.close();
    }
}
