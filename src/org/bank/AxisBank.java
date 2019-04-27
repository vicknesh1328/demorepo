package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
System.out.println("inytres is 8%");
}
	public static void main(String[] args) {
		AxisBank m = new AxisBank();
		m.fixed();
		m.deposit();
		m.saving();
	}
}
