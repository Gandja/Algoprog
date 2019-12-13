/*
Треугольник Паскаля
Даны два числа n и m. Создайте двумерный массив [n][m] и заполните его по следующим правилам: Числа, стоящие в строке 0 или в столбце 0 равны 1 (A[0][j]=1, A[i][0]=1). Для всех остальных элементов массива A[i][j]=A[i-1][j]+A[i][j-1], то есть каждый элемент равен сумме двух элементов, стоящих слева и сверху от него.
Входные данные
Программа получает на вход два числа n и m.

Выходные данные
Выведите n строк по m чисел в каждой — искомый массив.
*/
import java.util.Scanner;

public class t362 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		String arr [] = in.split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int [][] intArray = new int [n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(i == 0 || j ==0){
					intArray[i][j] = 1;
				}else {
					intArray[i][j] = intArray[i-1][j] + intArray[i][j-1];
				}
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}