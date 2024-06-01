import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение трех чисел с плавающей запятой
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextDouble();
        }

        // Сортировка сторон в порядке убывания
        Arrays.sort(sides);
        double A = sides[2];
        double B = sides[1];
        double C = sides[0];

        // Проверка на возможность треугольника
        if (A >= B + C) {
            System.out.println("Nao forma triangulo");
            return;
        }

        // Проверка типа треугольника
        if (A * A == B * B + C * C) {
            System.out.println("Triangulo retagulo");
        } else if (A * A > B * B + C * C) {
            System.out.println("Triangulo obtusangulo");
        } else {
            System.out.println("Triangulo acutangulo");
        }

        if (A == B && B == C) {
            System.out.println("Triangulo Equilatero");
        } else if (A == B || B == C || A == C) {
            System.out.println("Triangulo Isosceles");
        }

        scanner.close();
    }
}
