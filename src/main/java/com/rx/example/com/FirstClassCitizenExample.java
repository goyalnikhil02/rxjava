package com.rx.example.com;

import java.util.function.BiFunction;

public class FirstClassCitizenExample {

	public static void main(String[] args) {

		BiFunction<String, String, String> concatFunction = (s, t) -> {
			return s + t;
		};
		System.out.println(concatFunction.apply("Hello", "World 1"));

		concatFunction = FirstClassCitizenExample::concatString1;
		System.out.println(concatFunction.apply("Hello ", "World2 "));

		FirstClassCitizenExample instance = new FirstClassCitizenExample();
		concatFunction = instance::concatString2;
		System.out.println(concatFunction.apply("Hello ", "World 3 "));

	}

	public static String concatString1(String a, String b) {
		return a + b;
	}

	public String concatString2(String a, String b) {
		return a + b;
	}

}
