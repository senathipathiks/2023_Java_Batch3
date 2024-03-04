package com.assesmentDS;

import java.util.Optional;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {
//		String newTextBlock = """
//		<html>
//		<body>
//		<em>Cool LTS Java 17 Features</em>\
//		</body>
//		</html>
//		""";
//		System.out.println(newTextBlock);
		Stream<String> stream = Stream.of("a", "b", "c");
		Optional<String> result = stream.filter(s -> s.equals("d")).findFirst();
		}
}
