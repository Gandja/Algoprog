/*
Является ли слово палиндромом?
По данной строке определите, является ли она палиндромом (то есть, можно ли прочесть ее наоборот, как, например, слово "топот").

Входные данные
На вход подается 1 строка без пробелов.

Выходные данные
Необходимо вывести  yes, если строка является палиндромом, и no в противном случае.

*/
import java.util.Scanner;

public class t108 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int j = line.length()-1;
		for(int i = 0; j-i > i; i++) {
			if(line.charAt(i) != line.charAt(j-i)) {
				System.out.println("no");
				System.exit(0);
			}
		}
		System.out.println("yes");
	}
}