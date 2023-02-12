// В консоли запросить имя пользователя.
// В зависимости от текущего времени, вывести приветствие вида.

import java.time.LocalDateTime;

public class lesson1_task2 {
    public static void main(String[] args) {

        System.out.printf("Сейчас %dч\n", LocalDateTime.now().getHour());
        int hourNow = LocalDateTime.now().getHour();
        if (hourNow > 5 && hourNow < 12) {
            System.out.println("Доброе утро!");
        } else if (hourNow > 12 && hourNow < 18) {
            System.out.println("Доброго дня!");
        } else if (hourNow > 18 && hourNow < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Пора спать!");
        }

    }
}
