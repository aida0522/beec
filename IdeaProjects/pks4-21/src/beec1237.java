import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            int maxLength = longestCommonSubstring(s1, s2);
            System.out.println(maxLength);
        }

        scanner.close();
    }

    public static int longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Создаем матрицу для хранения длин наибольших общих подстрок
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;

        // Заполняем матрицу
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }

        return maxLength;
    }
}
