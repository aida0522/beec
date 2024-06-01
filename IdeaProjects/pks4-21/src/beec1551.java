import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества тестовых случаев
        int n = scanner.nextInt();
        scanner.nextLine(); // Чтение символа новой строки

        for (int i = 0; i < n; i++) {
            String sentence = scanner.nextLine().replaceAll("[,\\s]", ""); // Удаление запятых и пробелов из предложения
            Set<Character> uniqueChars = new HashSet<>();

            // Добавление всех символов из предложения в множество
            for (char c : sentence.toCharArray()) {
                uniqueChars.add(c);
            }

            // Определение категории предложения
            if (uniqueChars.size() == 26) {
                System.out.println("Frase oppla");
            } else if (uniqueChars.size() >= 13) {
                System.out.println("Frase Quase oppla");
            } else {
                System.out.println("Frase Mal Elaborada");
            }
        }

        scanner.close();
    }
}
