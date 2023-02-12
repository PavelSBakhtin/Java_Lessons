// Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;

public class lesson3_task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qweq");
        list.add("fgdfg");
        list.add("234");
        list.add("343");
        list.add("fgf");
        list.add("fgf");
        list.add("Сатурн");
        list.add("123");
        list.add("Земля");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.valueOf(list.get(i));
                list.remove(i);
                i--;
            } catch (Exception e) {
                // System.out.println("-X-");
            }
        }
        System.out.println(list);
    }
}
