import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать перевод строки после числа n

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            StringBuilder encryptedLine = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);

                // Проверяем, является ли символ буквой
                if (Character.isLetter(c)) {
                    // Шифруем букву, сдвигая её на три позиции вправо в таблице ASCII
                    c = (char) (c + 3);

                    // Проверяем, если буква вышла за пределы буквенного диапазона, корректируем
                    if ((Character.isLowerCase(line.charAt(j)) && c > 'z') || (Character.isUpperCase(line.charAt(j)) && c > 'Z')) {
                        c = (char) (c - 26);
                    }
                }

                encryptedLine.append(c);
            }

            // Сдвигаем символы на одну позицию влево
            for (int j = 0; j < encryptedLine.length(); j++) {
                char c = encryptedLine.charAt(j);

                if (Character.isLetter(c)) {
                    c = (char) (c - 1);

                    // Проверяем, если буква вышла за пределы буквенного диапазона, корректируем
                    if ((Character.isLowerCase(encryptedLine.charAt(j)) && c < 'a') || (Character.isUpperCase(encryptedLine.charAt(j)) && c < 'A')) {
                        c = (char) (c + 26);
                    }
                }

                encryptedLine.setCharAt(j, c);
            }

            System.out.println(encryptedLine);
        }

        scanner.close();
    }
}
