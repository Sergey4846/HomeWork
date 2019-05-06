package homework.task1.homework.task2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for ( int i=2; i < n; i++) {
            if (n%i == 0) {
                System.out.println("Число "+n+" является составным");
                return;
            }
        }
        System.out.println("Число "+n+" является простым");
    }
}