package behavioural.stateII;

public class RejectedState implements PaymentState{

	@Override
	public String approvePayment(Payment payment) {
		System.out.println("Approved Payment");
		payment.setState(new ApprovedState());
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
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rejected Payment"; 
	}

}
