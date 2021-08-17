package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReaderOfWords {
    public static void main(String[] args) {

        Scanner fileScanner;
        try {
            fileScanner = new Scanner(new File("C:\\Users\\twist\\IdeaProjects\\Java 2.0\\src\\main\\java\\reader\\dust in the wind.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Слова в файле или сам файл не найден!");
            return;
        }

        TreeMap<String, Integer> songwords = new TreeMap<>();
        int max = 0;
        String maxWord = null;
        while (fileScanner.hasNext()) {
            String word = fileScanner.next();
            int counter = songwords.getOrDefault(word, 0);
            counter++;
            if (counter > max) {
                max = counter;
                maxWord = word;
            }
            songwords.put(word, counter);
        }

        System.out.println("Отсортированные слова из файла в алфавитном порядке: " + songwords.keySet());

        System.out.println("Статистика появления по каждому слову:");
        songwords.forEach((key, value) -> System.out.println(key + ": " + value + " раз(а)"));

        System.out.println("Слово с максимальным количеством повторений: " + maxWord + ", повторилось " + max + " раз(а)");
    }
}