/*
E. Анаграммы
Даны две строки, состоящие из строчных латинских букв. Требуется определить, являются ли эти строки анаграммами, т. е. отличаются ли они только порядком следования символов.

Формат ввода
Входной файл содержит две строки строчных латинских символов, каждая не длиннее 100 000 символов. Строки разделяются символом перевода строки.

Формат вывода
Выходной файл должен содержать единицу, если строки являются анаграммами, и ноль в противном случае.
*/

import java.util.Scanner;
import java.util.TreeMap;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.nextLine();
        String secondStr = sc.nextLine();
        int firstLen = firstStr.length();
        int secondLen = secondStr.length();
        int n = 0;
        if (firstLen != secondLen) {
            System.out.println("0");
            System.exit(0);
        }
        TreeMap<Character, Integer> first = new TreeMap<>();
        TreeMap<Character, Integer> second = new TreeMap<>();
        for (int i = 0; i < firstLen; i++) {
            try {
                n = first.get(firstStr.charAt(i));

            } catch (Exception e) {
                n = 0;
            }
            first.put(firstStr.charAt(i), n + 1);

            try {
                n = second.get(secondStr.charAt(i));

            } catch (Exception e) {
                n = 0;
            }
            second.put(secondStr.charAt(i), n + 1);

        }
        if (first.entrySet().containsAll(second.entrySet()) && second.entrySet().containsAll(first.entrySet())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

}