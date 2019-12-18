package club.banyuan.homework.ioDemo;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/edz/Desktop/understand_Java/src/club/banyuan/homework/ioDemo/a.txt");
        File file2 = new File("/Users/edz/Desktop/understand_Java/src/club/banyuan/homework/ioDemo/b.txt");
        InputStream f1=new FileInputStream(file1);
        OutputStream f2= new FileOutputStream(file2);
        byte[] ch = new byte[(int) file1.length()];


        f1 = new FileInputStream(file1);
        f1.read(ch);
        f1.close();
        String st = new String(ch);
        System.out.println(st);


        f2 = new FileOutputStream(file2);
        f2.write(ch);
        f2.close();

    }
}
