/*
Перевести символ в верхний регистр
Напишите функцию unsigned char ToUpper(unsigned char c) (C/C++), function ToUpper(c:char):char (Pascal), которая переводит данный символ в верхний регистр.
Входные данные
Задан один символ c.

Выходные данные
Если символ является строчной буквой латинского алфавита (то есть буквой от a до z), выведите вместо него аналогичную заглавную букву, иначе выведите тот же самый символ (такая операция называется "перевод в верхний регистр").
*/

import java.io.InputStreamReader;
import java.io.IOException;

public class t102 {
		public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		char symbol = (char) in.read();
		if( (int)symbol >= 97 && (int)symbol <= 122) {
			System.out.println(toUpper(symbol));	
		}
		else {
			System.out.println(symbol);
		}
	}

	public static char toUpper(char c) {
		int up = ((int) c) - 32;
		return (char)up;
	}
	
}