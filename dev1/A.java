package main;

public class A {

	private int sign;

	public void FUNC1(int para, int para1, int para2) {
		sign = para;// 修复bug
		if (sign > 0) {
			B.sub(para1, para2);
		}
	}

	/**
	 * 函数功能： 该函数计算两个整型参数相减并输出
	 */
	public void FUNC2(int para1, int para2) {
		if (para1 > para2) {
			System.out.println(para1 - para2);
		}
	}
}
