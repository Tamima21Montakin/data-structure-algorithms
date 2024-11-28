package dataStructureAlgorithmProject.chapter_1;

/*R-1.11 Modify the CreditCard class from Code Fragment 1.5 to include a method that
updates the credit limit.
R-1.12 Modify the CreditCard class from Code Fragment 1.5 so that it ignores any request
to process a negative payment amount.*/

import java.util.Scanner;

public class CreditCard {
	// customer, bank, account , limit, balance
	private String customer;
	private String bank;
	private String account;
	private int limit;
	private double balance;

	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;

	}

	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);

	}

	public String getCustomer() {
		return customer;
	}

	public String getBank() {
		return bank;
	}

	public String getAccount() {
		return account;
	}

	public int getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	}

	public boolean charge(double chg) {
		if (balance + chg > limit)
			return false;
		balance += chg;
		return true;
	}

	public void makePayment(double pymnt) {
		balance -= pymnt;
	}

	public void updateLimit(int newLimit) {
		limit = newLimit;
		System.out.println("New updated Limit of account - " + account + " is " + limit);

	}

	public static void printSummary(CreditCard card) {
		System.out.println("Customer = " + card.customer);
		System.out.println("Bank = " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance);
		System.out.println("Limit = " + card.limit);
	}

	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];

		wallet[0] = new CreditCard("Tamima MOntakin", "Sonali Bank", "acnt1 000 111", 400);
		wallet[1] = new CreditCard("Tamima MOntakin", "Sonali Bank", "acnt2 000 222", 3500);
		wallet[2] = new CreditCard("Tamima MOntakin", "Sonali Bank", "acnt3 000 333", 2500, 300);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the for loop limit of charge : ");
		int chargefrLim = input.nextInt();
		for (int i = 1; i <= chargefrLim; i++) {
			wallet[0].charge(3 * i);
			wallet[1].charge(2 * i);
			wallet[2].charge(i);

		}

		for (int i = 0; i < wallet.length; i++)

		{
			System.out.println(
					"Initial Balance of account (" + wallet[i].account + ") = " + String.valueOf(wallet[i].balance));
		}

		for (CreditCard card : wallet) {
			CreditCard.printSummary(card);
			while (card.getBalance() > 200.0) {
				card.makePayment(200);
				System.out.println("New Balance = " + card.getBalance());
			}
			if (card == wallet[0]) {
				card.updateLimit(10000);

			}

		}

		input.close();
	}

}
