import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать перевод строки после числа n

        for (int i = 0; i < n; i++) {
            String value = scanner.nextLine();
            int totalLEDs = 0;

            // Подсчитываем количество светодиодов для каждой цифры в числе
            for (int j = 0; j < value.length(); j++) {
                char digit = value.charAt(j);
                totalLEDs += countLEDs(digit);
            }

            System.out.println(totalLEDs + " светодиоды");
        }

        scanner.close();
    }

    // Функция для подсчета количества светодиодов, необходимых для отображения цифры
    public static int countLEDs(char digit) {
        switch (digit) {
            case '1':
                return 2;
            case '2':
            case '3':
            case '5':
                return 5;
            case '4':
                return 4;
            case '6':
            case '9':
            case '0':
                return 6;
            case '7':
                return 3;
            case '8':
                return 7;
            default:
                return 0;
        }
    }
}
