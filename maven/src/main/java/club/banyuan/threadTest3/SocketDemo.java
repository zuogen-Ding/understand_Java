package club.banyuan.threadTest3;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

//读取端循环读取，如果输入端输入886，就结束

public class SocketDemo {
    public  static void main(String[] args) {
        try {
            DatagramSocket datagramSocket=new DatagramSocket();
            InetAddress inetAddress=InetAddress.getLocalHost();
            Scanner scanner=new Scanner(System.in );
            System.out.println("请输入数据");
            String string=scanner.next();
            DatagramPacket op=null;
            while (string!=null){
                if("886".equals(string)){
                    break;
                }
                op=new DatagramPacket(string.getBytes(),0,string.getBytes().length,inetAddress,1234);
                datagramSocket.send(op);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
