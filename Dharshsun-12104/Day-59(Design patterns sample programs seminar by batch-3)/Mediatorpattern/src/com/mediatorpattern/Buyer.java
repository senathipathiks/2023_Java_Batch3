package com.mediatorpattern;

//colleague
public abstract class Buyer { 
    
    // this class holds the buyer 
    protected Mediator mediator; 
    protected String name; 
    protected int price; 
  
    public Buyer(Mediator med, String name) 
    { 
        this.mediator = med; 
        this.name = name; 
    } 
  
    public abstract void bid(int price); 
  
    public abstract void cancelTheBid(); 
} 