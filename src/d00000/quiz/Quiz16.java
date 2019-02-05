package d00000.quiz;

public class Quiz16 {
    public static void main(String[] args) {
        Mail[] mails = {
                new StandardMail(10, false),
                new StandardMail(40, true),
                new NonStandardMail(450, true),
                new NonStandardMail(1200, false)
        };

        int total = 0;
        for (int i = 0; i < mails.length; i++) {
            Mail mail = mails[i];
            total += mail.getCharge();
            System.out.println(mail + ", " + mail.getCharge() + "円");
        }
        System.out.println("合計: " + total + "円");
    }
}
