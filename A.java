package main;

public class A {

	private int sign;
	
	public void FUNC1(int para, int para1, int para2) {
		sign = para;//修复bug
		if (sign > 0) {
			B.sub(para1, para2);
		}
	}
}
