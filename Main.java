public class Main {

    public static void main(String[] args) {

        AlertSystem alertSystem = new AlertSystem(new EmailService());

        // Email
        alertSystem.sendAlert("Email alert: System update available.");

        // Switch to SMS
        alertSystem.setMedium(new SMSService());
        alertSystem.sendAlert("SMS alert: Security issue detected.");

        // Switch to WhatsApp
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.sendAlert("WhatsApp alert: New login detected.");
    }
}
