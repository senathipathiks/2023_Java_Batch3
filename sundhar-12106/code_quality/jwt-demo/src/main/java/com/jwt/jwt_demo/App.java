package com.jwt.jwt_demo;

import java.time.LocalDate;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class App {
	public static void main(String[] args) {
		final String SECRET = "Srinimama";
		System.out.println("Hello World! : " + LocalDate.now());
		String token = Jwts.builder().setId("s123").setSubject("Sundharraj").signWith(SignatureAlgorithm.HS256,SECRET.getBytes()).compact();

		System.out.println(token);
	}
}
