// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

import java.util.*;

public class lesson6_task1 {
    public static void main(String[] args) {
        Set<Integer> numsHash = new HashSet<>(Arrays.asList(1, 200, 3, 2, 4, 50, 6000, 3));
        System.out.println(numsHash);
        Set<Integer> numsLink = new LinkedHashSet<>(Arrays.asList(1, 200, 3, 2, 4, 50, 6000, 3));
        System.out.println(numsLink);
    }
}
