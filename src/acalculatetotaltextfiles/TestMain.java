package acalculatetotaltextfiles;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("nhập đường dẫn fle");
        Scanner scanner= new Scanner(System.in);
        String path= scanner.nextLine();
        TextFileIntegers readfileEx= new TextFileIntegers();
        readfileEx.readFileText(path);
    }
}
