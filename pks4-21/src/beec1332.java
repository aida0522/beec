import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем словарь с правильными написаниями и их числовыми представлениями
        Map<String, Integer> wordDict = new HashMap<>();
        wordDict.put("one", 1);
        wordDict.put("two", 2);
        wordDict.put("three", 3);

        // Считываем количество слов
        int n = scanner.nextInt();
        scanner.nextLine(); // Считываем пустую строку после числа

        // Проходим по каждому слову и выводим его числовое представление
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine().trim();
            for (Map.Entry<String, Integer> entry : wordDict.entrySet()) {
                String correctWord = entry.getKey();
                int number = entry.getValue();
                if (word.length() == correctWord.length()) {
                    int diffCount = 0;
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(j) != correctWord.charAt(j)) {
                            diffCount++;
                        }
                    }
                    if (diffCount == 1) {
                        System.out.println(number);
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}
