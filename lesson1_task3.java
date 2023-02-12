// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

public class lesson1_task3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 1, 0, 1, 1, 1, 1, 1 };
        int kolvo = 0;
        int max_kolvo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                kolvo += 1;
            } else {
                if (kolvo > max_kolvo) {
                    max_kolvo = kolvo;
                }
                kolvo = 0;
            }
        }
        if (kolvo > max_kolvo) {
            max_kolvo = kolvo;
        }
        System.out.println(max_kolvo);
    }
}
