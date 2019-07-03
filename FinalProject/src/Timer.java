/*import doryan.windowsnotificationapi.fr.Notification;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.TimerTask;
import java.util.Calendar;
public class Timer extends TaskManager {
    TimerTask tt = new TimerTask() {
        @Override
        public void run() {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int mins = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);
            if (hour == hr && mins == min && second == sec) {
                try {
                    Notification.sendNotification(task.taskName, task.taskDesc, TrayIcon.MessageType.NONE);
                }
                catch(MalformedURLException e) {
                    e.printStackTrace();

                }
                catch(AWTException e) {
                    e.printStackTrace();
                }

            }
        }

    };
}
*/

