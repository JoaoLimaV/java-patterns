package behavioural.stateII;

public class Payment {
	
	private Object state;
	
	public Payment() {
		setState(new PendingState());
		((PendingState) this.state).pendingPayment(this);
 	}
	
	public void setState(Object state) {
		this.state = state;
	}
	
	public void approvePayment() {
		((ApprovedState) this.state).approvePayment(this);
	};
	
	public void awaitPayment() {
		((PendingState) this.state).pendingPayment(this);
	};
	
	public void rejectPayment() {
		((RejectedState) this.state).rejectPayment(this);
	};
	
	@Override
	public String toString() {
		return this.state.toString();
	}
}
