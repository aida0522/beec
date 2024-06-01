import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String htmlLine = convertToHTML(line);
            System.out.println(htmlLine);
        }

        scanner.close();
    }

    public static String convertToHTML(String line) {
        StringBuilder htmlLine = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (currentChar == '_') {
                // Начинаем тег курсива
                htmlLine.append("<i>");
                // Продолжаем читать до конца курсива
                while (i + 1 < line.length() && line.charAt(i + 1) != '_') {
                    htmlLine.append(line.charAt(++i));
                }
                // Завершаем тег курсива
                htmlLine.append("</i>");
            } else if (currentChar == '*') {
                // Начинаем тег жирного шрифта
                htmlLine.append("<b>");
                // Продолжаем читать до конца жирного шрифта
                while (i + 1 < line.length() && line.charAt(i + 1) != '*') {
                    htmlLine.append(line.charAt(++i));
                }
                // Завершаем тег жирного шрифта
                htmlLine.append("</b>");
            } else {
                // Просто добавляем символ к результату
                htmlLine.append(currentChar);
            }
        }

        return htmlLine.toString();
    }
}
