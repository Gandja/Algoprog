/*
C. Удаление дубликатов
Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить из него все повторения.

Желательно получить решение, которое не считывает входной файл целиком в память, т.е., использует лишь константный объем памяти в процессе работы.

Формат ввода
Первая строка входного файла содержит единственное число n, n ≤ 1000000.

На следующих n строк расположены числа — элементы массива, по одному на строку. Числа отсортированы по неубыванию.

Формат вывода
Выходной файл должен содержать следующие в порядке возрастания уникальные элементы входного массива.
*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class B {
	public static void main ( String args []) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			hs.add(sc.nextInt());
		}
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}