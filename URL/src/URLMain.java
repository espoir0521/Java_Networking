import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mirim on 2015-09-22.
 */
public class URLMain {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader br = null;
        String line = "";
        StringBuffer sb = new StringBuffer();

        //URL
        //블로터 : http://feeds.feedburner.com/bloter
        String urlString = "http://feeds.feedburner.com/bloter";

        //make Reader
        try {
            url = new URL(urlString);
            br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            //read
            while ((line = br.readLine()) != null) {
                //print
                //System.out.println(line);
                sb.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //make GUI
        Frame frame = new Frame("B");
        List list = new List();
        frame.add(list);

        //pattern matching
        Pattern pattern = Pattern.compile("<title>(.+?)</title>");
        Matcher matcher = pattern.matcher(sb.toString());
        while (matcher.find()) {
            //System.out.println(matcher.group(1).trim());
            list.add(matcher.group(1).trim());

        }

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}