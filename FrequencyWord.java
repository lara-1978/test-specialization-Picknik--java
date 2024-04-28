import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyWord extends FileNotFoundException{

    public static void main(String[] args) {
        File file = new File("input.txt" );
    try{
        Scanner scanner =new Scanner(file);
    
        Map<String, Integer> FrequencyWord = new  HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();    //  В каждой итерации цикла эта строка читает следующее слово из scanner и присваивает его переменной word.

            FrequencyWord.put(word, FrequencyWord.getOrDefault(word, 0) + 1);  // тут word-ключи, FreqWord-значения.
         // Эта строка добавляет текущее слово в карту или обновляет его частоту на 1, если оно уже присутствует в карте.

        }
        // Выводим частоту слов
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : FrequencyWord.entrySet()) {   // цикл, который перебирает каждую запись (entry) в объекте Map
            System.out.println(entry.getKey() + " : " + entry.getValue());  //  строка выводит на экран ключ  и его значениe, разделенные двоеточием и пробелом.

        }
        scanner.close();
        } catch (FileNotFoundException e) {  // этот блок выполняется, если возникает определенный тип исключения - в данном случае, FileNotFoundException.
        //Он используется для обработки ситуаций, когда файл не найден.

        System.out.println("Файл не найден!");
        e.printStackTrace();  //  строка выводит стек вызовов исключения e, предоставляя подробную информацию о том, где и почему произошло исключение.
        }
    }
}
