package club.banyuan.fileTest;

import java.io.*;

public class FileTest3 {

    ////创建a/test.txt文件并在其中输入"hello world",创建一个输入流读取该文件中的文本,
    // 并且把小写的l变成大写L再利用输出流写入到b/test.txt中

    public static void main(String[] args) throws IOException {
        File file =new File("a.txt");
        Writer writer=new FileWriter(file,true);
        writer.write("hello world");
        writer.close();

        Reader reader=new FileReader("a.txt");
        char[] a= new char[(int)file.length()];
        reader.read(a);
        String s=String.valueOf(a);
        System.out.println(s.length());
        String s1= s.replaceAll("l","L");
        reader.close();

        File file1=new File("b.txt");
        Writer writer1=new FileWriter(file1);
        writer1.write(s1);
        writer1.close();

    }

}
