import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Sender extends Thread {
    Socket socket;
    DataOutputStream out;

    Sender(Socket socket) {
        this.socket = socket;
        //make DataOutputStream
        out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        //input message
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        // writeUTF(message)
        out.writeUTF(message);
    }
}