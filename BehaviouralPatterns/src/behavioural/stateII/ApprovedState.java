package behavioural.stateII;

public class ApprovedState implements PaymentState {

	@Override
	public String approvePayment(Payment payment) {
		System.out.println("Approved Payment");
		return null;
	}

	@Override
	public String pendingPayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rejectPayment(Payment payment) {
		System.out.println("Rejected Payment");
		payment.setState(new RejectedState());
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Approved Payment"; 
	}

}
