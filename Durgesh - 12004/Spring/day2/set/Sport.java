package com.day2.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sport {

	private int id;
	private String name;
	private Map<Integer, String> player;
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sport(int id, String name, HashMap<Integer, String> player) {
		super();
		this.id = id;
		this.name = name;
		this.player = player;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getPlayer() {
		return player;
	}
	public void setPlayer(HashMap<Integer, String> player) {
		this.player = player;
	}
	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + ", player=" + player + "]";
	}
	
	void show() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		
//		Set<Entry<Integer, String>> set = player.entrySet();
//		Iterator<Entry<Integer, String>> it = set.iterator();
//		while (it.hasNext()) {
//			Entry<Integer,String> entry =it.next();
//			System.out.println("Jersey No : "+entry.getKey()+ " Player : "+entry.getValue());
//
//		}
		
		for (Integer i : player.keySet()) {
			System.out.println("Jersey No : "+i+ " Player : "+player.get(i));
		}
	
	}
	
}
