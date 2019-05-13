import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task26 {
    public static void main(String[] args) {
               Integer[] marks = new Integer[25];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] = ((int) (10 * Math.random()));
        }

        ArrayList<Integer> marks1 = new ArrayList<Integer>(Arrays.asList(marks));

        System.out.println("Полный список: ");
        System.out.println(marks1);
        Iterator<Integer> iterator = marks1.iterator();

        while (iterator.hasNext()) {
            if ((Integer) iterator.next() <= 3) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println("Положительные отметки:");
        System.out.println(marks1);

    }


}



