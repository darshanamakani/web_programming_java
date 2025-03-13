import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:3000/phpmyadmin/.");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}