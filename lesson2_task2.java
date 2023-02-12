// Напишите метод, который сжимает строку. (StringBuilder)
// Пример: вход aaaabbbcdd; вывод a4b3c1d2.

import java.util.Scanner;

public class lesson2_task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n введите строку: ");
        String string = scan.next();
        scan.close();
        System.out.println(ZipString(string));
    }

    public static String ZipString(String str) {
        StringBuilder zip = new StringBuilder();
        int count = 1;
        for (Integer i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == (str.charAt(i + 1))) {
                count++;
            } else {
                zip.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        zip.append(str.charAt(str.length() - 1)).append(Integer.toString(count));
        return zip.toString();
    }
}

/* public class lesson2_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        System.out.print("Введите стоку: ");
        String line = sc.next();
        sc.close();
        int count = 0;
        char sign = line.charAt(0);
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == sign) {
                count++;
            } else {
                res.append(count).append(sign);
                count = 1;
                sign = line.charAt(i);
            }
        }
        res.append(count).append(sign);
        System.out.println(res);
    }
} */
