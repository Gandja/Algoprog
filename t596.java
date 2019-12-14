/*
Утренняя пробежка - 1
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 70% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.

Входные данные
На вход программа получает два действительных числа x и y . Числа положительные, действительные, не превосходят 1000, заданы с точностью до шести знаков после запятой.

Выходные данные
Программа должна вывести единственное целое число.
*/


import java.util.Scanner;


public class t596 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String [] arr = line.split(" ");
		double x = Double.parseDouble(arr[0]);
		double y = Double.parseDouble(arr[1]);
		int day = 1;
		while(x < y && Math.abs(x-y) > 0.00000001) {
			x = x + x * 0.7;
			day++;
		}
		System.out.println(day);
	}
}