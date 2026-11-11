package Keyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsKeyword {
    public static void main(String[] args) {
        
    }

    public void readFile() throws FileNotFoundException{
        File file = new File("D:\\test.txt");

        // this require exception to hald the error
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
