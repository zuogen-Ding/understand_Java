package club.banyuan.homework.studyfile;

import java.io.File;

public class StudyFile {
    public static void main(String[] args) {
        File file1 = new File("/Users/edz/Desktop/understand_java");
        find(file1.getPath());

    }

    public static void find(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            File[] f = file.listFiles();

            if (f != null && f.length > 0) {

                for (File a : f) {

                    if (a.isDirectory()) {
                        find(a.getPath());
                    } else {
                        System.out.println(a);
                    }
                }
            }
        }

    }

}

