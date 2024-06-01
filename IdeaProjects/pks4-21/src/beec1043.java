import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение трех чисел с плавающей запятой
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Проверка, можно ли составить треугольник
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
