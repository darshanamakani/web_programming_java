import java.io.*;
import java.net.*;

class URLConnectionex {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:3000/h1.php");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
