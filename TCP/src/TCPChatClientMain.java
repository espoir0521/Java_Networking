import java.io.IOException;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatClientMain {
    public static void main(String[] args) throws IOException {
        String serverIp = "localhost";
        Socket socket;

        //make socket
        socket = new Socket(serverIp, 1116);

        //make Sender
        Sender sender = new Sender(socket);
        sender.start();

        //make Receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();

    }
}