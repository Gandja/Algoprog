/*
Парты
В некоторой школе решили набрать три новых класса и оборудовать кабинеты для них новыми партами. За каждой партой может сидеть два учащихся. Известно количество учащихся в каждом из трех классов. Выведите наименьшее число парт, которое нужно приобрести для них.

Входные данные
Программа получает на вход три натуральных числа: количество учащихся в каждом из трех классов.

Выходные данные
Выведите ответ на задачу.
*/
import java.util.Scanner;

public class t2946 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		int count =  (first / 2 + first % 2) + (second / 2 + second % 2) + (third / 2 + third % 2);
		System.out.println(count);
	}
}