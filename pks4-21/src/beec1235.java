import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать перевод строки после числа n

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int mid = line.length() / 2;
            StringBuilder decodedLine = new StringBuilder();

            // Декодируем правую половину строки
            for (int j = mid - 1; j >= 0; j--) {
                decodedLine.append(line.charAt(j));
            }

            // Декодируем левую половину строки
            for (int j = line.length() - 1; j >= mid; j--) {
                decodedLine.append(line.charAt(j));
            }

            System.out.println(decodedLine);
        }

        scanner.close();
    }
}
