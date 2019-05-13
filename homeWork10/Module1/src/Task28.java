import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static java.util.Collections.*;

public class Task28 {
    public static void main(String[] args) {
        System.out.println("Полный список: ");
        Integer[] marks = new Integer[25];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] = ((int) (1 + 10 * Math.random()));
        }
        ArrayList<Integer> marks1 = new ArrayList<Integer>(Arrays.asList(marks));
        System.out.print(marks1);

        for (Iterator<Integer> iterator = marks1.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            if (integer < Collections.max(marks1)) {
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println("Самые высокие отметки:");
        System.out.println(marks1);
    }

}

