package URL;
import java.net.URL;
import java.net.MalformedURLException;

public class URLClass {
    public static void main(String[] args) throws MalformedURLException {
        URL sampleURL = new URL("http://example.com:80/docs" + "/books/tutorial/index.html?name=networking#DOWNLOADING");
        System.out.println("protocol: " +sampleURL.getProtocol());
        System.out.println("authority: " + sampleURL.getAuthority());
        System.out.println("host: " + sampleURL.getHost());
        System.out.println("port: " + sampleURL.getPort());
        System.out.println("path: " + sampleURL.getPath());
        System.out.println("query: " + sampleURL.getQuery());
        System.out.println("filename: " + sampleURL.getFile());
        System.out.println("ref: " + sampleURL.getRef());
    }
}
