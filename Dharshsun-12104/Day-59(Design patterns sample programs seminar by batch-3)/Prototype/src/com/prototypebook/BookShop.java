package com.prototypebook;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
private String shopName;
List <Book> books = new ArrayList<>();
public BookShop() {
	super();
	// TODO Auto-generated constructor stub
}
public BookShop(String shopName, List<Book> books) {
	super();
	this.shopName = shopName;
	this.books = books;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}

public void loadBooks() {
	
	for(int i=1;i<=10;i++) {
		Book b=new Book();
		b.setBookId(i);
		b.setBookName("Book" +i);
		getBooks().add(b);
	}
}


@Override
protected BookShop clone() throws CloneNotSupportedException {
	
	BookShop shp=new BookShop();
	for(Book b:getBooks()) {
		shp.getBooks().add(b);
	}
	return shp;
}

@Override
public String toString() {
	return "BookShop [shopName=" + shopName + ", books=" + books + "]";
}


}
