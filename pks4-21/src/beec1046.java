import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение времени начала и окончания игры
        int startTime = scanner.nextInt();
        int endTime = scanner.nextInt();

        // Рассчет продолжительности игры
        int duration;
        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        // Вывод продолжительности игры
        System.out.printf("O Jogo Durou %d Hora(s)%n", duration);

        scanner.close();
    }
}
