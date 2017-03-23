import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailService
{

    public static final String SMTPPORT = "587";
    final Mailcontent mailcontent = new Mailcontent();
    private final SenderAccount senderAccount;
    private final SmtpConfiguration smtpConfiguration;

    public MailService(SmtpConfiguration smtpConfiguration, SenderAccount senderAccount) {

        this.smtpConfiguration = smtpConfiguration;
        this.senderAccount = senderAccount;
    }

    public void sendMail() {


        String host = "smtp.gmail.com";

        Session session = setMailProperties();
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(senderAccount.USER_NAME));
            InternetAddress[] toAddress = new InternetAddress[mailcontent.to.length];

            // To get the array of addresses
            for(int i = 0; i < mailcontent.to.length; i++ ) {
                toAddress[i] = new InternetAddress(mailcontent.to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(mailcontent.subject);
            message.setText(mailcontent.body);

            Transport transport = session.getTransport("smtp");
            transport.connect(smtpConfiguration.host, senderAccount.USER_NAME, senderAccount.PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }

    private Session setMailProperties() {
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpConfiguration.host);
        props.put("mail.smtp.user", senderAccount.USER_NAME);
        props.put("mail.smtp.password", senderAccount.PASSWORD);
        props.put("mail.smtp.port", smtpConfiguration.smtpPort);
        props.put("mail.smtp.auth", "true");

        return Session.getDefaultInstance(props);
    }
}
