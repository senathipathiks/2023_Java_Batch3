package com.ims.exception;

public class InventoryNotFoundException extends RuntimeException {

	//create cutsom exception
	public InventoryNotFoundException(int itemId) {
		super("could not found the item with id "+itemId);
	}
	

}
