import java.util.ArrayList;

public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> log = new ArrayList<>();

    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
    }

    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    public void sendAlert(String message) {
        medium.sendNotification(message);
        log.add(message);
    }
}
