package com.mediatorpattern;

import java.util.ArrayList;

public class AuctionBuyer extends Buyer { 
	  
    // implementation of the bidding process 
    // There is an option to bid and an option to 
    // cancel the bidding  
    public AuctionBuyer(Mediator mediator,String name) 
    { 
        super(mediator, name); 
    } 
  
    @Override
    public void bid(int price) 
    { 
        this.price = price; 
    } 
  
    @Override
    public void cancelTheBid() 
    { 
        this.price = -1; 
    } 
} 
  