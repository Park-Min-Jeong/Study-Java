package classobject;

class BankAccount {
	String name;
	double balance;
	static int count;
	
	BankAccount(String name, double balance) {
		this.name = name; // parameter == attribute name -> must use this
		this.balance = balance;
		count++;
	}
}

public class Code54 {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Alice", 100000);
		BankAccount ba2 = new BankAccount("Paul", 30000);
		BankAccount ba3 = new BankAccount("Cindy", 28900);
		BankAccount ba4 = new BankAccount("David", 98700);
		BankAccount ba5 = new BankAccount("Tom", 45100);
		
		System.out.println("number of accounts: " + BankAccount.count);
	}
}
