import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание таблицы соответствия словам и животным
        Map<String, Map<String, String>> animals = new HashMap<>();
        Map<String, String> vertebrates = new HashMap<>();
        vertebrates.put("ave", "aguia");
        vertebrates.put("mamifero", "vaca");
        animals.put("vertebrado", vertebrates);

        Map<String, String> invertebrates = new HashMap<>();
        invertebrates.put("inseto", "pulga");
        invertebrates.put("anelideo", "minhoca");
        animals.put("invertebrado", invertebrates);

        // Чтение трех слов
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        // Определение животного по входным словам
        String animal = animals.get(word1).get(word2);
        if (animal != null) {
            System.out.println(animal);
        } else {
            System.out.println(animals.get(word1).get(word3));
        }

        scanner.close();
    }
}
