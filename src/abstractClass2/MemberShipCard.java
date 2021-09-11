package abstractClass2;

public class MemberShipCard extends Card {
	int radius;
	public MemberShipCard(String holderName, String cardNumber, String expiryDate,int radius) {
		super(holderName, cardNumber, expiryDate);
		this.radius=radius;
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


}
