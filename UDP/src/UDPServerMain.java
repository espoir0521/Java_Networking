import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPServerMain {
    public static void main(String[] args) throws IOException {
        //make socket
        DatagramSocket ds = new DatagramSocket(1226);

        while (true) {
            byte[] data = new byte[1024];//버퍼를 비워서 새로 변수를 생성해야 데이터가 겹치지 않는다.
            //make packet
            DatagramPacket dp = new DatagramPacket(data, data.length);

            //receive
            System.out.println("UDP Server standby...");
            ds.receive(dp);

            //print message
            //127.0.0.1>hi
            String address = dp.getAddress().toString();
            String message = new String(dp.getData()).trim();//바이트를 String으로 변환할 때 뒤에 공간이 남는데 그런 공간을 없애주는 것이 trim()이다.
            System.out.println(address + "> " + message);

            if (message.equalsIgnoreCase("bye")) {
                break;
            }
        }
    }
}