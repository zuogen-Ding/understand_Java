package club.banyuan.fileTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.WeakHashMap;

public class FileTest2 {

    //2.利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据

    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一组数据(或字符串)，每个数据以'，'隔开");
        String string= sc.next();
        String[] st=string.split("[，,]");
        System.out.println(Arrays.toString(st));
        int count =0;
        File file =new File("/Users/edz/Desktop/understand_Java/maven/a.txt");
        Writer writer =new FileWriter(file,true);
        for (int i = 0; i <st.length ; i++) {
            String s=st[i];
            writer.write(s);
            if(count!=0&&(count+1)%5==0||count==st.length-1){
                writer.write(".\n");
            }else{
                writer.write(",");
            }
            count++;
        }
        writer.close();
    }
}
