package club.banyuan.fileTest;

import java.io.*;

public class FileTest4 {

    //在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，
    // 然后再从文件中把Student对象的信息读出,并且把读出来的数据重新赛给一个对象,然后显示在控制台上


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1=new Student("李四",12,"上海");
        Student student2=new Student();

        File file=new File("a.txt");
        OutputStream outputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(student1);
        objectOutputStream.close();
        outputStream.close();

        InputStream inputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream =new ObjectInputStream(inputStream);
        Student student=(Student) objectInputStream.readObject();
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        student1.setAddress(student.getAddress());

        System.out.println(student1.toString());
    }
}
