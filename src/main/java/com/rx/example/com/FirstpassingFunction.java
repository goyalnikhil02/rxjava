package com.rx.example.com;

import java.util.function.Function;

public class FirstpassingFunction {

	public static void main(String[] args) {

		System.out.println(concatTransform("Hello::", " World", (s) -> {
			return s.toUpperCase();

		}));

		Function<String, String> tansformLower = s -> {
			return s.toLowerCase();
		};
		System.out.println("TO Lower values:::" + concatTransform("Nikhil", "Goyal", tansformLower));
	}

	private static String concatTransform(String a, String b, Function<String, String> stringTransform) {
		if (stringTransform != null) {
			a = stringTransform.apply(a);
			b = stringTransform.apply(b);

		}
		return a + b;
	}

}
