package club.banyuan.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Receive {
    public static void main(String[] args) {

        while (true){
            try {
                DatagramSocket datagramSocket=new DatagramSocket(1234);
                byte[] bytes=new byte[1024];
                DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
                datagramSocket.receive(dp);
                String st=new String(bytes);
                System.out.println(st);

                datagramSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
