/*
Часы - 1
С начала суток прошло H часов, M минут, S секунд (0H12, 0M60, 0S60). По данным числам H, M, S определите угол (в градусах), на который повернулаcь часовая стрелка с начала суток и выведите его в виде действительного числа.

При решении этой задачи нельзя пользоваться условными инструкциями и циклами.

Входные данные
Вводятся три целых неотрицательных числа.

Выходные данные
Выведите ответ на задачу.
*/

import java.util.Scanner;


public class t3612 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double hour = Double.parseDouble(scanner.next());
		double minute = Double.parseDouble(scanner.next());
		double second = Double.parseDouble(scanner.next());
		double degree = (hour * 60 + minute + second / 60) / 2;
		System.out.println(degree);
	}
}