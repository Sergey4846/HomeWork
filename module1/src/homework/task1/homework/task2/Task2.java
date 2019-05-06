package homework.task1.homework.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int b, i, n, s;

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            b = n;
            s = 0;
            i = 0;
            while (n != 0) {
                s = s + n % 10;
                n = n / 10;

            }
            System.out.println("Сумма цифр числа: " + b + " равна: " + s);
        }else {
            System.out.println("Вы ввели неверное число");
        }

    }
}