package abstractClass2;

public class PayBackCard extends Card {
	int piontsEarned;
	double totalAmount;
	public int getPiontsEarned() {
		return piontsEarned;
	}
	public void setPiontsEarned(int piontsEarned) {
		this.piontsEarned = piontsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public PayBackCard(String holderName, String cardNumber, String expiryDate,int piontsEaned,double otalAmount)
	{
		super(holderName, cardNumber, expiryDate);
		this.piontsEarned=piontsEarned;
		this.totalAmount=totalAmount;
	}

}
