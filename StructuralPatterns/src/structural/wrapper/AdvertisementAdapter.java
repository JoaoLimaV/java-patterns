package structural.wrapper;

public class AdvertisementAdapter  extends Advertisement{
	private Ad ad; 
	
	public AdvertisementAdapter(Ad ad) {
		super(
			ad.description.substring(0, 15), 
			ad.description, 
			ad.price
		);
		
		this.status = convertStatus(ad.status);
		this.ad = ad;
		
	}
	
	private AdversisementStatus convertStatus(String status) {
		switch(status) {
			case     "new":      return AdversisementStatus.DRAFT;
			case     "reviewed": return AdversisementStatus.PUBLISHED;
			case     "deleted":  return AdversisementStatus.DELETED;
			default:             return AdversisementStatus.DRAFT;
		}
	}
	
	
	@Override
	public void publish() {
		ad.publish();
	}
	
	@Override
	public void inactivate() {
		ad.delete();
	}
	
	@Override
	public void activate() {
		ad.publish();
	}
	
	@Override
	public void delete() {
		ad.delete();
	}
}
