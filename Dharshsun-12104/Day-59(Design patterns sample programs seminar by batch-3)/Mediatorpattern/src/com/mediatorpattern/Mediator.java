package com.mediatorpattern;


//This is an interface that defines the contract for concrete mediators. In this case, 
//it declares methods for adding a buyer and finding the highest bidder.

//mediator
public interface Mediator {
	public void addBuyer(Buyer buyer); 
    public void findHighestBidder(); 
}
