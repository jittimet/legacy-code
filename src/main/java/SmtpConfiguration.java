public class SmtpConfiguration {
     String host;
     String smtpPort;

    public SmtpConfiguration() {
    }

    public SmtpConfiguration(String host, String smtpPort) {

        this.host = host;
        this.smtpPort = smtpPort;
    }
}