package behavioural.stateII;

public class PendingState implements PaymentState {

	@Override
	public String approvePayment(Payment payment) {
		System.out.println("Approved Payment");
		payment.setState(new ApprovedState());
		return null;
	}

	@Override
	public String pendingPayment(Payment payment) {
		System.out.println("Await Payment...");
		return null;
	}

	@Override
	public String rejectPayment(Payment payment) {
		System.out.println("Rejected Payment");
		payment.setState(new RejectedState());
		return null;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Pending Payment"; 
	}
	
}
