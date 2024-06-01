import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение четырех оценок
        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();

        // Рассчет среднего с весами 2, 3, 4, 1
        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10.0;

        // Печать среднего
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exameScore = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exameScore);
            media = (media + exameScore) / 2.0;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media);
        }

        scanner.close();
    }
}
