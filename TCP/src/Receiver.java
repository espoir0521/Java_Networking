import java.io.DataInputStream;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Receiver extends Thread {
    Socket socket;
    DataInputStream in;

    Receiver(Socket socket) {
        this.socket = socket;
        //make DataInputStream
        in = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        //readUTF
        String message = in.readUTF();
        //print message
        System.out.println(socket.getInetAddress() + " > " + message);//"주소 > "
    }
}