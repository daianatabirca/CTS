package ro.ase.csie.cts.seminar3;

public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(Person destination, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS to " + destination.getMobile());
		System.out.println(msg);
	}

}
