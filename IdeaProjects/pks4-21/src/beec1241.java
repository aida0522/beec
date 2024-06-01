import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать перевод строки после числа n

        for (int i = 0; i < n; i++) {
            String A = scanner.next();
            String B = scanner.next();

            if (endsWith(A, B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }

        scanner.close();
    }

    public static boolean endsWith(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();

        // Если длина B больше длины A, то B не может быть подстрокой A
        if (lenB > lenA) {
            return false;
        }

        // Сравниваем последние цифры A и B
        for (int i = 0; i < lenB; i++) {
            if (A.charAt(lenA - lenB + i) != B.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
я