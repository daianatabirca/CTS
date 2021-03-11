package ro.ase.csie.cts.seminar3;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(Person destination, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending email to " + destination.getEmail());
		System.out.println(msg);
	}

}
