package behavioural.stateII;

public interface PaymentState {
	
	public String approvePayment(Payment payment);
	
	public String pendingPayment(Payment payment);
	
	public String rejectPayment(Payment payment);

}
