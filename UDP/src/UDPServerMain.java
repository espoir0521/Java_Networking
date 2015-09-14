import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPServerMain {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[1024];

        //make socket
        DatagramSocket ds = new DatagramSocket(1226);

        //make packet
        DatagramPacket dp = new DatagramPacket(data, data.length);

        //receive
        System.out.println("UDP Server standby...");
        ds.receive(dp);

        //print message
        System.out.println(dp.getData());
    }
}