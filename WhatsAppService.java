/**
 * WhatsApp-based notification service.
 *
 * @author Your Name
 * @version 1.0
 */
public class WhatsAppService implements NotificationMedium {

    /**
     * Sends a WhatsApp notification.
     *
     * @param message the message to send
     */
    @Override
    public void sendNotification(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
