package copyfiletext;

import bvaluemax.ReadAndWriteFile;
import javafx.scene.chart.BubbleChart;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFiles {
    public List<String> readFile() {
        List<String> list = new ArrayList<>();
        try {
            File infile = new File("D:\\Code Gym\\Module 2\\Week 4\\16_IOTextFile\\src\\copyfiletext\\copyfiletext1.txt");
            if(!infile.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(infile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = "";
            while ((line=reader.readLine())!=null){
                System.out.println(line);
                list.add(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("file k tồn tại of nội dung lỗi");;
        }
        return list;
    }
    public void writeFile(List<String> list){
        try{
            FileWriter filewriter= new FileWriter("D:\\Code Gym\\Module 2\\Week 4\\16_IOTextFile\\src\\copyfiletext\\copyfiletext2.txt");
            BufferedWriter writer= new BufferedWriter(filewriter);
            for(String line: list){
                writer.write(line+"\n");
            }
            writer.close();
            filewriter.close();
        }catch (IOException e){
            System.out.println("file k có giá trị");
        }
    }

    public static void main(String[] args) {
        ReadWriteFiles two= new ReadWriteFiles();
        List<String> list = two.readFile();
        two.writeFile(list);

    }
}
