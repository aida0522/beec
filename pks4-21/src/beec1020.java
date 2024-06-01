import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int d = scanner.nextInt();
            int n = Integer.parseInt(scanner.next());

            // Проверяем условие выхода из цикла
            if (d == 0 && n == 0) {
                break;
            }

            // Преобразуем число в строку для удобства обработки
            String originalNumber = String.valueOf(n);
            StringBuilder correctedNumber = new StringBuilder();

            // Проходим по каждой цифре в числе
            for (int i = 0; i < originalNumber.length(); i++) {
                // Если текущая цифра равна цифре, которая не удалась в машине,
                // пропускаем эту цифру
                if (originalNumber.charAt(i) - '0' == d) {
                    continue;
                }

                // В противном случае, добавляем текущую цифру в скорректированное число
                correctedNumber.append(originalNumber.charAt(i));
            }

            // Если после удаления цифры получается пустая строка,
            // значит в контракте не осталось ни одной цифры, кроме удаленной
            if (correctedNumber.length() == 0) {
                System.out.println(0);
            } else {
                // Выводим скорректированное число
                System.out.println(correctedNumber);
            }
        }

        scanner.close();
    }
}
