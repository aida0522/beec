import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать перевод строки после числа n

        for (int i = 0; i < n; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            String combinedString = combineStrings(s1, s2);
            System.out.println(combinedString);
        }

        scanner.close();
    }

    public static String combineStrings(String s1, String s2) {
        StringBuilder combined = new StringBuilder();

        int length1 = s1.length();
        int length2 = s2.length();

        int minLength = Math.min(length1, length2);

        // Объединяем строки, чередуя символы
        for (int i = 0; i < minLength; i++) {
            combined.append(s1.charAt(i));
            combined.append(s2.charAt(i));
        }

        // Добавляем оставшиеся символы более длинной строки
        if (length1 > length2) {
            combined.append(s1.substring(minLength));
        } else if (length2 > length1) {
            combined.append(s2.substring(minLength));
        }

        return combined.toString();
    }
}
