// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему. Пример: 3 2 1 3 5 6. Вывод: 2 1 5 6 3 3.

public class lesson1_task4 {
    public static void main(String[] args) {
        int value = 3;
        int[] arr = new int[] {3, 2, 1, 3, 5, 6};
        int[] resArr = new int[arr.length];
        int index = 0;
        for (int k : arr) {
            if (k != value) {
                resArr[index] = k;
                index++;
            }
        }
        for (int i = index; i < resArr.length; i++) {
            resArr[i] = 3;
        }
        for (int j : resArr) {
            System.out.printf("%d ", j);
        }
    }
}
