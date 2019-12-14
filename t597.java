/*
Утренняя пробежка - 2
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 70% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.

Входные данные
На вход программа получает два действительных числа x и y . Числа положительные, действительные, не превосходят 1000, заданы с точностью до шести знаков после запятой.
Внимание! В некоторых тестах оба числа находятся на одной строке, а в некоторых — на разных!


Выходные данные
Программа должна вывести единственное целое число.
*/

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

public class t597 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String [] arr = line.split(" ");
		double x = Double.parseDouble(arr[0]);
		double y = 0;
		if(arr.length < 2){
			String secondLine = scanner.nextLine();
			 y = Double.parseDouble(secondLine); 
		}else{
			 y = Double.parseDouble(arr[1]);
		}
		int day = 1;
		double sum = x;
		while(sum < y && Math.abs(x-y) > 0.00000001) {
			x = x + x * 0.7;
			x = round(x, 6);
			sum = sum + x;
			day++;
		}
		System.out.println(day);
	}
	//function with round double 
	private static double round(double value, int places) {
		if(places < 0) System.exit(0);
		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}