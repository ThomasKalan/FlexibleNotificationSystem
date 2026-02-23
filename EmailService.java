/**
 * Email-based notification service.
 */
public class EmailService implements NotificationMedium {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
