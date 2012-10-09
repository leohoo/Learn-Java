class BankAccount {
	String owner;
	int balance;

	void deposit(int amount) {
		balance += amount;
	}

	void withdraw(int amount) {
		balance -= amount;
	}
}