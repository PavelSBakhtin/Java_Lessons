// Реализовать консольное приложение, которое:
// 1) Принимает от пользователя и “запоминает” строки.
// 2) Если введено print, выводит строки так, чтобы последняя введенная была первой
// в списке, а первая - последней.

import java.util.Scanner;
import java.util.Stack;

public class lesson4_task3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            String text = iScanner.nextLine();
            if (text.equals("print")) {
                int size = stack.size();
                for (int i = 0; i < size; i++) {
                    System.out.print(stack.pop() + " ");
                }
                break;
            }
            stack.push(text);
        }
        iScanner.close();
    }
}

/* public class lesson4_task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String str = "";
        while (!str.equals("print")) {
            System.out.println("Введите строку: ");
            str = scan.nextLine();
            if (!str.equals("print")) {
                stack.push(str);
            }
        }
        scan.close();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
} */
