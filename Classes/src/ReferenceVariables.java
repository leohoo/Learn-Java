public class ReferenceVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount account;
		account = new BankAccount();
		account.owner = "Bill Gates";

		BankAccount account2 = account;
		account2.owner = "Barrack Obama";

		System.out.println(account.owner);
	}

}
