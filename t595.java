/*
Диета

В некоторой сверхсекретной лаборатории изучаются физические возможности животных. Любой живой организм нуждается в трех компонентах пищи – белках, жирах и углеводах. Известен набор продуктов, имеющийся в распоряжении лаборатории, и меню животных – сколько единиц каждого продукта они получают. Известно также, сколько белков, жиров и углеводов необходимо для нормальной жизнедеятельности животного. Необходимо определить, получает ли животное достаточное количество питательных веществ. Известно, что животному требуется в сутки X белков, Y жиров и Z углеводов.

Известно также, что всего животное получает в сутки N продуктов питания, и для каждого из них известны Ai, Bi, Ci и Qi – соответственно, энергетическая ценность единицы продукта в белках, жирах и углеводах и количество единиц этого продукта. Все числа – действительные, заданные с точностью до 5 знаков после запятой.

Входные данные
На первой строке входных данных записаны числа X , Y и Z . На второй строке записано число N. Далее на N строках записаны, соответственно, Ai, Bi, Ci и Qi.

Выходные данные
Выведите YES , если данный пищевой рацион является достаточным по всем параметрам, и NO в противном случае.
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class t595 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        double X = Double.parseDouble(arr[0]);
        double Y = Double.parseDouble(arr[1]);
        double Z = Double.parseDouble(arr[2]);
        double N = Double.parseDouble(scanner.nextLine());
        double sumA = 0;
        double sumB = 0;
        double sumC = 0;

        for (int i = 0; i < N; i++) {
            String[] product = scanner.nextLine().split(" ");
            double A = Double.parseDouble(product[0]);
            double B = Double.parseDouble(product[1]);
            double C = Double.parseDouble(product[2]);
            double Q = Double.parseDouble(product[3]);
            sumA += round(A * Q, 5);
            sumB += round(B * Q, 5);
            sumC += round(C * Q, 5);
        }
        if ((Math.abs(round(sumA, 5) - X) < 0.00001
                && Math.abs(round(sumB, 5) - Y) < 0.00001
                && Math.abs(round(sumC, 5) - Z) < 0.00001) 
            || (sumA > X && sumB > Y && sumC > Z)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    private static double round(double value, int places) {
        if (places < 0) System.exit(0);
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}