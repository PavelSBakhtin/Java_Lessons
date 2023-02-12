// Заполнить список 10 случайными числами, и отсортировать его.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class lesson3_task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        for (Object x : list) {
            System.out.print(x + " ");
        }
    }
}
