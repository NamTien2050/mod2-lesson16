package copyfiletext;

import bvaluemax.ReadAndWriteFile;
import javafx.scene.chart.BubbleChart;

import java.io.*;

public class ReadWriteFiles {
    public void readFile() {
        try {
            File infile = new File("copyfiletext1.txt");
            if(!infile.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(infile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("file k tồn tại of nội dung lỗi");;
        }
    }
    public void writeFile(){
        try{
            FileWriter writer= new FileWriter("copyfiletext2.txt");
            BufferedWriter buffered= new BufferedWriter(writer);
            writer.close();
        }catch (IOException e){
            System.out.println("file k có giá trị");
        }
    }

    public static void main(String[] args) {
        ReadWriteFiles two= new ReadWriteFiles();
        two.readFile();
        two.writeFile();

    }
}
