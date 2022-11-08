import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Downloads\\romeo-and-juliet.txt");
        int i = -1;
        StringBuilder result = new StringBuilder();
        while ((i = fileInputStream.read()) != -1) {
            result.append((char) i);
        }
        fileInputStream.close();
        String book = result.toString();
        String[] words = book.split("\\W");
        String maxLengthWord = words[0];
        for (String word : words){
            if (word.length() >= maxLengthWord.length()){
                maxLengthWord = word;
            }
        }
        FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Downloads\\maxLength.txt");
        System.out.println(maxLengthWord);
        fileWriter.write(maxLengthWord);
        fileWriter.close();
    }
}