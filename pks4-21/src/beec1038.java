import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Таблица цен для продуктов
        double[] prices = {0.0, 4.00, 4.50, 5.00, 2.00, 1.50};

        // Создаем объект Scanner для чтения ввода
        Scanner scanner = new Scanner(System.in);

        // Читаем код продукта и количество
        int code = scanner.nextInt();
        int quantity = scanner.nextInt();

        // Рассчитываем общую стоимость
        double total = prices[code] * quantity;

        // Выводим результат с двумя знаками после запятой
        System.out.printf("Total: R$ %.2f%n", total);

        // Закрываем сканер
        scanner.close();
    }
}
