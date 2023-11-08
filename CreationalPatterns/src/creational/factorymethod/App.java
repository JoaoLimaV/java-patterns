package creational.factorymethod;

import creational.factorymethod.Notification.Type;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = args[0];
		
		Notification not = NotificationFactory.createNotification(Type.PUSH);
		
		not.notifyUser();
	}

}
