// Реализовать консольное приложение, которое принимает от пользователя строку вида text~num
// 1) Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2) Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// До тех пор, пока пользователь не введёт "stop"

import java.util.Scanner;
import java.util.LinkedList;

public class lesson4_task2 {
    public static void main(String[] args) {
        LinkedList<String> text = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            if (input.equals("stop")) {
                System.out.println(text);
                scan.close();
                break;
            }
            String[] string = input.split("~");
            if (string[0].equals("print")) {
                System.out.println(text.remove(Integer.parseInt(string[1])));
            }
            else {
                text.add(Integer.parseInt(string[1]), string[0]);
            }
        }
    }
}
