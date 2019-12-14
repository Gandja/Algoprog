/*
a + b = c
Даны три действительных числа: a, b, c. Проверьте, выполняется ли равенство a + b = c . Если равенство выполняется, выведите YES, если не выполняется, выведите NO.

Входные данные
Числа a, b, c –  действительные, положительные, не превосходят 10 и заданы не более, чем с 7 знаками после точки.

Выходные данные
Выведите результат сравнения.
*/

import java.util.Scanner;


public class t74 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = Double.parseDouble(scanner.next());
		double b = Double.parseDouble(scanner.next());
		double c = Double.parseDouble(scanner.next());
		a = a + b;
		c = c - a;
		//operation with real numbers has measurement error  
		//and if it not more than 0,00000001 numbers the same
		if(Math.abs(c) < 0.00000001){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}