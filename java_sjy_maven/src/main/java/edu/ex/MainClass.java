package edu.ex;

public class MainClass {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setFirstNum(10);
		calculator.setSecondNum(10);

		calculator.add();
		calculator.sub();
	}
}
