/**
 * SMS-based notification service.
 */
public class SMSService implements NotificationMedium {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
