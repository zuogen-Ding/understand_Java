package club.banyuan.fileTest;

import java.io.*;
import java.io.IOException;

public class FileTest1 {


        //找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用地柜完成)

        public static void main(String[] args) throws IOException {
            new FileTest1().copy("/Users/edz/Desktop/maven/src/main/java/club/banyuan/maven", "/Users/edz/Desktop/maven/src/main/java/d.txt");

        }

        public void copy(String path1, String path2) throws IOException {
            File file = new File(path1);

            if (file.isDirectory()) {
                File[] f = file.listFiles();

                if (f != null && f.length > 0) {

                    for (File a : f) {
                        if (a.isDirectory()) {
                            copy(a.getPath(), path2);
                        } else {
                            if (a.getName().endsWith("txt")) {
                                read(a.getPath(), path2);
                            }
                        }
                    }
                }
            }

        }

        public void read(String pathA, String pathB) throws IOException {
            File file1 = new File(pathA);
            File file2 = new File(pathB);

            Reader reader = new FileReader(file1);
            Writer writer = new FileWriter(file2, true);
            char[] chars = new char[(int) file1.length()];
            reader.read(chars);
            reader.close();

            for (int i = 0; i < chars.length; i++) {
                if((int)chars[i]!=0) {
                    writer.write(chars[i]);
                }
            }
            writer.close();
        }
    }

