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


public class C {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.exit(0);
        }
        int number = scanner.nextInt();
        System.out.println(number);
        for (int i = 0; i < n - 1; i++) {
            int number1 = scanner.nextInt();
            if (number != number1) {
                number = number1;
                System.out.println(number);
            }
        }
        scanner.close();
    }
}