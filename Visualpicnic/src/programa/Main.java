package programa;

import java.io.File;
import java.util.Map;

/**
 * Главный класс программы.
 */
public class Main {
    /**
     * Метод main, запускающий программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        File inputFile = new File("input.txt");

        WordCounter wordCounter = new WordCounter(inputFile);
        int wordCount = wordCounter.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        LongestWordFinder longestWordFinder = new LongestWordFinder(inputFile);
        String longestWord = longestWordFinder.findLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        WordFrequencyCalculator wordFrequencyCalculator = new WordFrequencyCalculator(inputFile);
        Map<String, Integer> wordFrequency = wordFrequencyCalculator.calculateWordFrequency();
        System.out.println("Слова, встречающиеся чаще всего в файле: " + wordFrequency);
    }
}