public class Mailcontent {
    private static String RECIPIENT = "jittimet@gmail.com";
    String[] to;
    String subject = "Java send mail example";
    String body = "Welcome to JavaMail!";

    public Mailcontent() {
        this.to = new String[]{RECIPIENT};
    }
    public Mailcontent(String[] to)
    {
        this.to = to;
    }
}