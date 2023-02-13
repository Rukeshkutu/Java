package SendingEmail;

import com.sun.mail.pop3.POP3Store;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import java.util.Properties;

public class ReceiveMail {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.put("mail.pop3s.host", "pop.gmail.com");
        properties.put("mail.pop3s.port", "995");
        properties.put("mail.pop3s.starttls.enable", "true");

        Session emailSession = Session.getDefaultInstance(properties);

        POP3Store emailStore = (POP3Store) emailSession.getStore(("pop3s"));
        emailStore.connect("rukesh.456s@gmail.com", "ofyasfgapag");

        Folder emailFolder = emailStore.getFolder(("INBOX"));
        emailFolder.open(Folder.READ_ONLY);

        Message[] messages = emailFolder.getMessages();

        for(Message message : messages){
            System.out.println(message.getSubject());

        }
        emailFolder.close();
        emailStore.close();


    }
}
