package main;

public class A {

	private int sign = -1;
	
	public void FUNC1(int para, int para1, int para2) {
		if (sign < 0) {
			B.sub(para1, para2);
		}
	}
	
	public void FUNC2(int para1, int para2) {
		if (para1 > para2){System.out.println(para1-para2);}
	}
}
