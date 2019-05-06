package homework.task1.homework.task2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число для расчёта");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Integer.toString(a);
        String b = Integer.toString(a);
        System.out.println(b);

        int c = b.length();
        for (int i = 3; i < c; i += 3) {
            String before = b.substring(0, i + (i / 3 - 1));
            String after = b.substring(i + (i / 3 - 1));
            b = before + " " + after;
        }
        System.out.println(b);
    }
}


