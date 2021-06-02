package dreadfilecsv;

import java.io.*;

public class ReadWriteCsv {
    public static void main(String[] args) {
        {
            try {
                File file = new File("dReadfile.csv");
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (Exception e) {
                System.out.println("lỗi này không đọc được file");
            }
        }
    }
}
