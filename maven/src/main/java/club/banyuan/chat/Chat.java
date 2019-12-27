package club.banyuan.chat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Chat extends Thread{

    Duankou duankou;

    @Override
    public void run() {
        synchronized(duankou) {
            while (true) {
                try {
                    DatagramSocket datagramSocket = new DatagramSocket();
                    InetAddress inetAddress=InetAddress.getLocalHost();
                    Scanner scanner=new Scanner(System.in );
                    System.out.println("请输入数据");
                    String string=scanner.next();
                    DatagramPacket dp=null;
                    while (string!=null){
                        if("886".equals(string)){
                            break;
                        }
                        dp=new DatagramPacket(string.getBytes(),0,string.getBytes().length,inetAddress,duankou.NUM);
                        datagramSocket.send(dp);
                        datagramSocket.close();

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
