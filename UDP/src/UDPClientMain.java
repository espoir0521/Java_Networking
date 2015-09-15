import org.omg.CORBA.portable.UnknownException;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPClientMain {
    public static void main(String[] args) throws IOException {
        String message = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            //input message
            System.out.print("보낼 메시지 > ");
            message = sc.nextLine();//한 줄 읽음.

            //make packet
            DatagramPacket dp = new DatagramPacket(message.getBytes(),
                    message.getBytes().length, InetAddress.getByName("localhost"), 1226);

            //make socket
            DatagramSocket ds = new DatagramSocket();

            //send
            ds.send(dp);

            if (message.equalsIgnoreCase("bye")) {
                break;
            }
        }
    }
}