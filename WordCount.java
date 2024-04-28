import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input.txt");
    try{
        Scanner scanner =new Scanner(file);
        
        // 1. считаем кол-во слов в файле
        int WordCount = 0;
        while (scanner.hasNext())
        { scanner.next();
            WordCount ++;
        }
        scanner.close();
        
        System.out.println("Колл-во слов в файле:"+ WordCount);
        } catch (FileNotFoundException e) { // этот блок выполняется, если возникает определенный тип исключения - в данном случае, FileNotFoundException.
            //Он используется для обработки ситуаций, когда файл не найден.
            System.out.println("Файл не найден!");
            e.printStackTrace(); // строка выводит стек вызовов исключения e, предоставляя подробную информацию о том, где и почему произошло исключение.
        }
    }
}