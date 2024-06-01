import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества тестовых случаев
        int n = scanner.nextInt();
        scanner.nextLine(); // Чтение символа новой строки

        for (int i = 0; i < n; i++) {
            // Чтение количества людей в группе
            int k = scanner.nextInt();
            scanner.nextLine(); // Чтение символа новой строки

            Set<String> languages = new HashSet<>();

            // Чтение родного языка каждого человека и добавление его в множество
            for (int j = 0; j < k; j++) {
                String language = scanner.nextLine();
                languages.add(language);
            }

            // Определение общего языка в группе
            if (languages.contains("English") || languages.size() > 1) {
                System.out.println("English");
            } else {
                System.out.println(languages.iterator().next());
            }
        }

        scanner.close();
    }
}
