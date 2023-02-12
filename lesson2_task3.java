// Сохранить в файл слово TEXT сто раз.

// import java.io.FileReader;
import java.io.FileWriter;

public class lesson2_task3 {
    public static void main(String[] args) {
        String text = "TEXT";
        try {
            // FileReader flread = new FileReader("file.txt");
            FileWriter fwriter = new FileWriter("lesson2_task3_file.txt");
            for (int i = 0; i < 100; i++) {
                fwriter.write(text + "\n");
            }
            System.out.println("Получилось");
            fwriter.close();
        } catch (Exception e) {
            System.out.println("Что то не так");
        }
    }
}
