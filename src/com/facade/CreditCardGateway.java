package com.facade;

public class CreditCardGateway { 
	private BasicCard basicCard; //has-a
	private GoldCard goldCard; 
	private SilverCard silverCard; 
	
	public CreditCardGateway(){
		basicCard = new BasicCard();
		goldCard = new GoldCard();
		silverCard = new SilverCard();
	}
	
	public void getBasicCardDetails(){
		basicCard.charges();
		basicCard.getLimit();
	}
	
	public void getGoldCardDetails() {
		goldCard.charges();
		goldCard.getLimit();
	}
	
	public void getSilverCardDetails() {
		silverCard.charges();
		silverCard.getLimit();
	}
}
