package com.mediatorpattern;

import java.util.ArrayList;
//This class implements the Mediator interface. It maintains a list of buyers and provides methods to add a buyer 
//to the list and find the highest bidder among them.

//concrete mediator
public class AuctionMediator implements Mediator { 
	  
    // this class implements the interface and holds  
    // all the buyers in a Array list. 
    // We can add buyers and find the highest bidder 
    private ArrayList<Buyer> buyers; 
  
    public AuctionMediator() 
    { 
        buyers = new ArrayList<Buyer>(); 
    } 
  
    @Override
    public void addBuyer(Buyer buyer) 
    { 
        buyers.add(buyer); 
        System.out.println(buyer.name + " was added to" + 
                "the buyers list."); 
    } 
  
    @Override
    public void findHighestBidder() 
    { 
        int maxBid = 0; 
        Buyer winner = null; 
   
        for (Buyer b : buyers) { 
            if (b.price > maxBid) { 
                maxBid = b.price; 
                winner = b; 
            } 
        } 
        System.out.println("The auction winner is " + winner.name +  
        ". He paid " + winner.price + "$ for the item."); 
    } 
} 