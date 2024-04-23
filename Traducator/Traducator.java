import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.CharacterIterator;
import java.util.Scanner;

public class Traducator {

    public void wrongChar(char c, String str) {

    }

    public static void main(String[] args) throws IOException {
        String data;
        FileReader fisierTest = new FileReader("input.txt");
        BufferedReader codeReader = new BufferedReader(fisierTest);

        try {
            while ((data = codeReader.readLine()) != null) {
                data.split(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        codeReader.close();
    }
}