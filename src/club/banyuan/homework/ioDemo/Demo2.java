package club.banyuan.homework.ioDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        List<String > list =new ArrayList<String>();
        list.add("你好");
        list.add("你不好");

        File file1= new File("/Users/edz/Desktop/understand_Java/src/club/banyuan/homework/ioDemo/d.doc");
        File file2= new File("/Users/edz/Desktop/understand_Java/src/club/banyuan/homework/ioDemo/a.txt");
        Writer writer1=new FileWriter(file1,true);
        Writer writer2=new FileWriter(file2);
        writer1.write(list.get(0).toCharArray());
        writer1.write("\n");
        writer1.write(list.get(1).toCharArray());
        writer2.write(list.get(0).toCharArray());
        writer2.write(list.get(1).toCharArray());
//        writer.write(list.get(1));
        writer1.flush();
        writer2.flush();


    }
}
