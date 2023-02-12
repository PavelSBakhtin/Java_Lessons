// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class lesson1_task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in, "Cp866"); // "Cp866" - будет принимать рус.яз.
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.printf("Привет, %s!\n", name);
        scan.close();
    }
}
