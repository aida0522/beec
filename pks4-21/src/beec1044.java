import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение двух целых чисел
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Проверка, является ли B кратным A
        if (B % A == 0) {
            System.out.println("SAO Multiplos");
        } else {
            System.out.println("NAO SAO Multiplos");
        }

        scanner.close();
    }
}
