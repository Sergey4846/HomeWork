package homework.task1.homework.task2;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Массив:");
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (i + 100 * Math.random()));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println();

        System.out.println("Максимальное значение:");
        System.out.print(maxValue);
    }
}
