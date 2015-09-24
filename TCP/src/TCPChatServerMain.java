import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1116);
        Socket socket;

        System.out.println("TCP Chat Server standby....");
        //make socket(accept)
        socket = ss.accept();

        //make Sender
        Sender sender = new Sender(socket);
        sender.start();

        //make Receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();

    }
}