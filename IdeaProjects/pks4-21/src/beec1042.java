import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение трех целых чисел
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Сохранение исходных значений
        int[] original = {a, b, c};

        // Копирование и сортировка массива
        int[] sorted = original.clone();
        Arrays.sort(sorted);

        // Вывод отсортированных значений
        for (int num : sorted) {
            System.out.println(num);
        }

        // Печать пустой строки
        System.out.println();

        // Вывод исходных значений
        for (int num : original) {
            System.out.println(num);
        }

        scanner.close();
    }
}
