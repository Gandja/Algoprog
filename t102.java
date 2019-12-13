/*
Проверить, является ли символ цифрой
Входные данные
Задан единственный символ c.

Выходные данные
Необходимо вывести  строку yes, если символ является цифрой, и строку no в противном случае.

Примечание
Запрещается пользоваться стандартными функциями типа isdigit.
*/

import java.io.InputStreamReader;
import java.io.IOException;

public class t102 {
		public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		char symbol = (char) in.read();
		if(isDigit(symbol)){
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

	public static boolean isDigit(char c) {
		if((int) c >= 48 && (int) c <= 57){
			return true;
		}
		return false;
	}
}