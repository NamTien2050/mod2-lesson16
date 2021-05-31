package acalculatetotaltextfiles;

import java.io.*;

public class TextFileIntegers {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("tổng= "+sum);
        } catch (FileNotFoundException e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        } catch (Exception e) {
            System.out.println("lỗi này là lỗi không đọc được File");
        }
    }

}
