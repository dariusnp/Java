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
                String[] cuvinte = data.split(" ");
                for (int i = 0; i < cuvinte.length; ++i) {
                    String cuvant = cuvinte[i];
                    switch (cuvant) {
                        case "void":

                        case "main()":
                            System.out.print("public static void main(String[] args) {");
                            System.out.print(" \n");
                            break;
                        case "std::cout":
                            System.out.print('\t' + "System.out.print(");
                            String input;
                            for (int j = i + 2; j < cuvinte.length - 1; ++j) {
                                input = cuvinte[j];
                                System.out.print(input);
                                System.out.print(' ');
                            }
                            System.out.println(");");
                            break;
                        case "}":
                            System.out.print("}");
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        codeReader.close();
    }
}