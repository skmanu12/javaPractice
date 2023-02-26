package Java;

public class Account {
	int acc_no;
	String name;
	float amount;

	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	void deposit(float amt) {
		amount = amount + amt;
	}

	void withdraw(float amt) {
		amount = amount - amt;
	}

	void checkBalance() {
		System.out.println("Available balance:" + amount);
	}
void display() {
	System.out.println(acc_no+"-"+name+"-"+amount);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.insert(23456, "Manappa", 100000);
		a.checkBalance();
		a.deposit(2000);
		a.checkBalance();
		a.withdraw(50000);
		a.checkBalance();
		a.display();
	}

}
