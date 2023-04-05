package main;

public class B {

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	// 该bug经查与sub函数无关
	public static void sub(int a, int b) {
		System.out.println(a - b);
	}
}
