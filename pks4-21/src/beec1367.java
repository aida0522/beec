import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(); // Количество представлений в тесте

            if (n == 0) {
                break;
            }

            Map<Character, Integer> problemMap = new HashMap<>(); // Хранение времени и вердикта для каждой проблемы
            int totalScore = 0; // Общее количество баллов

            for (int i = 0; i < n; i++) {
                char problemId = scanner.next().charAt(0); // Идентификатор проблемы
                int time = scanner.nextInt(); // Время решения
                String verdict = scanner.next(); // Вердикт ("правильно" или "неверный")

                if (verdict.equals("правильно")) {
                    if (!problemMap.containsKey(problemId)) {
                        problemMap.put(problemId, time);
                        totalScore += time;
                    }
                } else {
                    totalScore += 20;
                }
            }

            // Вывод результатов для текущего тестового примера
            int solvedProblems = problemMap.size();
            System.out.println(solvedProblems + " " + totalScore);
        }

        scanner.close();
    }
}
