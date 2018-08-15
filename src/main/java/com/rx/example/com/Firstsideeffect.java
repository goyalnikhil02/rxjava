package com.rx.example.com;

public class Firstsideeffect {

	private int state = 0;

	public int f1(int x) {
		return x * 2;
	}

	public int f2(int x) {
		state = (++state % 3);
		return x * 2 + state;
	}

	public static void main(String[] args) {
		Firstsideeffect obj = new Firstsideeffect();
		for (int i = 0; i < 100; i++) {
			if (obj.f1(5) != 10) {
				throw new IllegalStateException();
			}

		}

		System.out.println("F1(5)=10 for all calls");

		for (int y = 0; y < 100; y++) {
			System.out.println("f2(5) return :" + obj.f2(5));
		}
		{

		}
	}

}
