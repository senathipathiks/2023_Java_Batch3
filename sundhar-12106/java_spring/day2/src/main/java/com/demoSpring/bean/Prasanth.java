package com.demoSpring.bean;

import java.util.ArrayList;
import java.util.List;

public class Prasanth {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();

		al.add(45);

		al.forEach(e -> {
			System.out.println(e);
		});
	}
}
