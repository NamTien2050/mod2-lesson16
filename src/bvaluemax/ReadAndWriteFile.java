package bvaluemax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
            String line="";
            while ((line= bufferedReader.readLine())!= null){
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return number;
    }
    public void writerFile(String filePath, int max){
        try {
            FileWriter writer=new FileWriter(filePath, true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("giá trị lớn nhất là: "+max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
