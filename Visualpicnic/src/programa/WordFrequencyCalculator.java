package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Класс для вычисления частоты слов в файле.
 */
public class WordFrequencyCalculator {
	private File file;

	/**
	 * Конструктор класса.
	 *
	 * @param file файл для анализа
	 */
	public WordFrequencyCalculator(File file) {
		this.file = file;
	}

	/**
	 * Метод для вычисления частоты каждого слова в файле.
	 *
	 * @return карта, содержащая слова и их частоту в файле
	 */
	public Map<String, Integer> calculateWordFrequency() {
		Map<String, Integer> wordFrequency = new HashMap<>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String word = scanner.next();
				wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ошибка: Файл не найден");
		}

		// Находим максимальную частоту слова
		int maxFrequency = 0;
		for (int frequency : wordFrequency.values()) {
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
			}
		}

		// Оставляем только слова с максимальной частотой
		int finalMaxFrequency = maxFrequency;
		wordFrequency.entrySet().removeIf(entry -> entry.getValue() != finalMaxFrequency);

		return wordFrequency;
	}
}