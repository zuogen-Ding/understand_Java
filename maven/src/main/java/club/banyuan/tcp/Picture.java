package club.banyuan.tcp;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class Picture {
    public static void main(String[] args) throws IOException {
        File file=new File("q.jpg");
        BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream(file)) ;
        byte[] bytes=new byte[47409];
        int d= inputStream.read(bytes);
        Socket socket=null;
//        int  len= inputStream.read(bytes);
        try {
            while (true) {
                socket = new Socket("192.168.11.160", 1234);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(bytes, 0, d);
                inputStream.close();

                socket.close();
                outputStream.close();

            }
            } catch(IOException e){
                e.printStackTrace();
            }

    }
}
