/*
Количество слов
Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность непробельных символов, слова разделены одним пробелом, первый и последний символ строки – не пробел).

Входные данные
На вход подается несколько строк.

Выходные данные
Необходимо вывести  количество слов в первой из введенных строк.
*/

import java.util.Scanner;

public class t106 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int count = 0;
		for(int i = 0; i < line.length()-1; i++) {
			if(line.charAt(i) == ' ' && line.charAt(i+1) != ' ') {
				count ++;
			}
		}
		System.out.println(count + 1);
	}
}