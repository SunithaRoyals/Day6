package abstractClass2;

public class Card {
	    protected String holderName;
        public String getHolderName() {
     	return holderName;
        }
        public void setHolderName(String holderName) {
	    this.holderName = holderName;
        }
        public String getCardNumber() {
	    return cardNumber;
        }
        public void setCardName(String cardName) {
	    this.cardNumber = cardNumber;
        }
        public String getExpiryDate() {
	    return expiryDate;
        }
        public void setExpiryDate(String expiryDate) {
	    this.expiryDate = expiryDate;
        }
        protected String cardNumber;
        protected String expiryDate;
        public Card(String holderName,String cardName,String expiryDate)
        {
     	this.holderName=holderName;
    	this.cardNumber=cardNumber;
     	this.expiryDate=expiryDate;
         }

}


