import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPServerMain {
    public static void main(String[] args) throws IOException {
        //make socket(accept)
        ServerSocket serverSocket = new ServerSocket(1019);
        Socket socket = serverSocket.accept();

        //make reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //read
        String message = reader.readLine();

        //print message
        System.out.println("주소 > " + message);
    }
}
