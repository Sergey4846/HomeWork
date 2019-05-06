package homework.task1.homework.task2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        //int max = array[0];
        //int min = array[0];
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (i + 100 * Math.random()));
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        for (int x : array) {
            if (x < min)
                min = x;
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);

        int max = array[0];
        for (int x : array) {
            if (x > max)
                max = x;
        }
        System.out.println("Максимальное значение: " + max);
        int sum = 0;
    }
}
