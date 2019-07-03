import doryan.windowsnotificationapi.fr.Notification;

import java.util.*;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.awt.AWTException;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;
import java.util.Timer;


public class TaskManager
{
    public static int hr;
    public static int min;
    public static int sec;
    public static Task task = new Task();
    public static Timer timer = new Timer();
    public static TimerTask tt = new TimerTask() {
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
    String blank;
    public static void main(String[] args) {
        LinkedList<Task> tasks = new LinkedList<Task>();

        System.out.println("Hello! Welcome to Evan's time manager. Would you like to create a new task?\n" +
                "1. Yes\n" +
                "2. No\n" +
                "3. Exit");
        Scanner userInput = new Scanner(System.in);
        int userResponse = userInput.nextInt();
        while (userResponse != 3) {

            if(userResponse == 1) {
                System.out.println("You have chosen to add a new task.\n" +
                        "To add a new task, first specify what this task is.");
                String blank = userInput.nextLine();
                String taskName = userInput.nextLine();
                System.out.println(taskName);
                System.out.println("Now, add a general description of the task");
                String taskDesc = userInput.nextLine();
                System.out.println("Hour you would like to run at?(Military time) ");
                hr = userInput.nextInt();
                System.out.println("Minute you would like to start at?");
                min = userInput.nextInt();
                System.out.println("Second you would like to run at?");
                sec = userInput.nextInt();
                task = new Task(taskName, taskDesc);
                tasks.add(task);
                System.out.println("Would you like to\n" +
                        "1. continue to create tasks OR\n" +
                        "2. Save your tasks and run");
                userResponse = userInput.nextInt();


                for (int i = 0; i < tasks.size(); i++) {
                    task.print();
                }
            }
            if (userResponse ==  2) {
                System.out.println("Your tasks will now run based on the scheduled time.");
                timer.schedule(tt, 500);

            }
        }
        System.exit(0);


    }
}
