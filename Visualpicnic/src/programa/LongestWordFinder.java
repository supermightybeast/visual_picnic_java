package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Класс для поиска самого длинного слова в файле.
 */
public class LongestWordFinder {
	private File file;

	/**
	 * Конструктор класса.
	 *
	 * @param file файл для анализа
	 */
	public LongestWordFinder(File file) {
		this.file = file;
	}

	/**
	 * Метод для поиска самого длинного слова в файле.
	 *
	 * @return самое длинное слово в файле
	 */
	public String findLongestWord() {
		String longestWord = "";
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String word = scanner.next();
				if (word.length() > longestWord.length()) {
					longestWord = word;
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ошибка: Файл не найден");
		}
		return longestWord;
	}
}