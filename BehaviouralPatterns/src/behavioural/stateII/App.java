package behavioural.stateII;

public class App {
	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.toString();
		payment.approvePayment();
		
		payment.setState(new ApprovedState());
		payment.approvePayment();
		payment.toString();
		
		payment.setState(new RejectedState());
		payment.rejectPayment();
		payment.toString();
	}
}

