/*
Ваня наблюдает за лягушкой

Ваня наблюдает за лягушкой. Изначально она сидит в точке 0 числовой прямой. Каждую секунду она прыгает на 1 вправо, пока не достигнет точки K. Затем она начинает каждую секунду прыгать на 1 влево, пока не вернется в точку 0, затем – опять вправо и т. д. Требуется определить, где окажется лягушка через T секунд.

Входные данные
Вводятся два числа K и T, разделенные пробелом. Оба числа натуральные и не превосходят 1 000 000 000.

Выходные данные
Вывести одно число – координату лягушки в момент времени T.
*/

import java.util.Scanner;

public class t534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        int k = Integer.parseInt(numbers[0]);
        int t = Integer.parseInt(numbers[1]);
        int point = t % (2 * k);
        point = point * (1 - point / k) + (2 * k - point) * (point / k);
        System.out.println(point);
    }
}