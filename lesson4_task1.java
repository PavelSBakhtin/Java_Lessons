// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class lesson4_task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arList.add(i);
        }
        long timeFinish = System.currentTimeMillis();

        System.out.println(timeFinish - timeStart);
        System.out.println("-----------------------");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linList.add(i);
        }
        timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);

    }
}
