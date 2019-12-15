/*
1/0!+1/1!+1/2!+...
По данному натуральному числу N найдите сумму чисел 1+1/1!+1/2!+1/3!+...+1/N!. Количество действий должно быть пропорционально N.

Входные данные
Задано единственное число N

Выходные данные
Необходимо вывести  результат вычисления в виде действительного числа c точностью до 5 знаков после запятой.
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class t120 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if(N > 30){
				N = 30;
			}
		double result = 1;
		double denominator = 1;
		for (int i = 0; i < N; i++) {
			denominator *= i + 1;
			result += round(1/denominator, 5);
		}
		System.out.println(result);
	}
	 private static double round(double value, int places) {
        if (places < 0) System.exit(0);
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}