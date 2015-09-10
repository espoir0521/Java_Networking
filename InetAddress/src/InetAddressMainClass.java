import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Mirim on 2015-09-08.
 */
public class InetAddressMainClass {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress my_add = InetAddress.getLocalHost();
        // 내 컴퓨터
        //get InetAddress from 127.0.0.1
        System.out.println("내 컴퓨터");
        //IP 주소
        System.out.println("IP 주소 : " + my_add.getHostAddress());
        //도메인 이름
        System.out.println("도메인 이름 : " + my_add.getHostName());

        System.out.println("===============================");

        InetAddress mirim_add = InetAddress.getByName("www.e-mirim.hs.kr");
        //미림 홈페이지
        //get InetAddress from www.e-mirim.hs.kr
        System.out.println("미림 홈페이지");
        //IP 주소
        System.out.println("IP 주소 : " + mirim_add.getHostAddress());
        //도메인 이름
        System.out.println("도메인 이름 : " + mirim_add.getHostName());
    }
}