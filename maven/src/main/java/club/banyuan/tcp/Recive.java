package club.banyuan.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recive {
    public static File set() throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mmss");
        Date date = new Date();
        String s = simpleDateFormat.format(date);
        File f = new File("a");
        File file = File.createTempFile(s, ".jpg", f);
        return file;
    }

    public static void main(String[] args) {


        try {

            ServerSocket serverSocket = new ServerSocket(1234);
            while (true) {
                Socket s = serverSocket.accept();
                InputStream inputStream = new BufferedInputStream(s.getInputStream());
                byte[] bytes = new byte[47409];
                int len = inputStream.read(bytes);
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(set()));

                outputStream.write(bytes, 0, len);
                inputStream.close();
                outputStream.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
