/*
Следующее четное
Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.

Примечание. До 01 марта 2019 г. задачу нельзя сдать на языке Паскаль.
Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу.
*/

import java.util.Scanner;

public class t2945 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nextEven = (n + 2) - (n % 2);
		System.out.println(nextEven);
	}
}