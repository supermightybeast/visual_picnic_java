package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Класс для подсчета количества слов в файле.
 */
public class WordCounter {
	private File file;

	/**
	 * Конструктор класса.
	 *
	 * @param file файл для анализа
	 */
	public WordCounter(File file) {
		this.file = file;
	}

	/**
	 * Метод для подсчета количества слов в файле.
	 *
	 * @return количество слов в файле
	 */
	public int countWords() {
		int wordCount = 0;
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				scanner.next();
				wordCount++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ошибка: Файл не найден");
		}
		return wordCount;
	}
}