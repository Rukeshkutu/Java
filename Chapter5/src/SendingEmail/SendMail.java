package SendingEmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void main(String[] args) {
        final String username = "rukseh.456s@gmail.com";
        final String password = " ";
        String to = "rukesh.456s@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, password);

            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test");
            message.setContent(
                    "<b> This is a test message</b>",
                    "text/html; charset = UTF-8"
            );
            message.setFileName("email.jpg");
            Transport.send(message);
            System.out.println("message sent successfully.........");
        }
        catch (MessagingException e){
            e.printStackTrace();
        }

    }
}
