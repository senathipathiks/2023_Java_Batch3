package com.prototypebook;

public class Prototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs1 = new BookShop();
		bs1.setShopName("Navelty");
		bs1.loadBooks();
		
		
		BookShop bs2=bs1.clone();
		bs2.setShopName("Abc");
		bs1.getBooks().remove(2);
		
		System.out.println(bs1);
		System.out.println(bs2);
	}
}

