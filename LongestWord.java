import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("input.txt" );
    try{
        Scanner scanner =new Scanner(file);

        String longestWord = "";
        
        while (scanner.hasNext()) {   // пробегаемся по словам из файла
            String word = scanner.next();
            if (word.length() > longestWord.length()) { // Проверяем, является ли текущее слово длиннее самого длинного слова
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово в файле: " + longestWord);
        
        scanner.close();
        }catch (FileNotFoundException e) {  // этот блок выполняется, если возникает определенный тип исключения - в данном случае, FileNotFoundException.
            //Он используется для обработки ситуаций, когда файл не найден.
            System.out.println("Файл не найден!");
            e.printStackTrace(); // строка выводит стек вызовов исключения e, предоставляя подробную информацию о том, где и почему произошло исключение.
        }
    }
}




    
    
