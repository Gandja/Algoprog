/*
E. Анаграммы
Даны две строки, состоящие из строчных латинских букв. Требуется определить, являются ли эти строки анаграммами, т. е. отличаются ли они только порядком следования символов.

Формат ввода
Входной файл содержит две строки строчных латинских символов, каждая не длиннее 100 000 символов. Строки разделяются символом перевода строки.

Формат вывода
Выходной файл должен содержать единицу, если строки являются анаграммами, и ноль в противном случае.
*/

import java.util.Scanner;

public class E {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		boolean yes = false;
		if(first.length() != second.length()){
			System.out.println("0");
			System.exit(0);
		}
		for(int i = 0; i < first.length(); i++){
			char symbol = first.charAt(i);
			if(second.indexOf(symbol) >= 0) {
				yes = true;
			}else {
				yes = false;
			}
		}
		if(yes) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}