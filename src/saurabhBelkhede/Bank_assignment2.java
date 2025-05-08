package saurabhBelkhede;
//Assignment 2

class Bank{
	int inibal = 1000;
	
	void debitamt(){
	 inibal = inibal - 500;
		}
	
	void credamt(){
	inibal = inibal + 200;
	}
	
	void prtBal(){
	System.out.println("current balance " + inibal);
	}
	
	public static void main(String[] args) {
	Bank bank=new Bank();
	bank.debitamt();
	bank.credamt();
	bank.prtBal();
	}
}