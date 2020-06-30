package kunli.entity;

import java.util.Scanner;

public class AccountDemo {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		System.out.println("Enter 1 for Account Balance, 2 for Deposit Money, 3 for Withdrow Money or Exit");
		Scanner in = new Scanner(System.in);
		String promp = in.nextLine();
		while(!promp.equals("Exit")) {
			if(promp.equals("1")) {
				System.out.println(accountBlance(account) + "\n");
			}else if(promp.equals("2")) {
				System.out.println("Please enter how many you want to deposit: ");
				double deposit = Double.parseDouble(in.nextLine());
				System.out.println(deposit(account, deposit)+ "\n");
			}else if(promp.equals("3")) {
				System.out.println("Please enter how many you want to withdraw: ");
				double withdraw = Double.parseDouble(in.nextLine());
				System.out.println(withdraw(account, withdraw));
			}
			System.out.println("Enter 1 for Account Balance, 2 for Deposit Money, 3 for Withdrow Money or Exit");
			promp = in.nextLine();
		}
		in.close();
		System.out.println("Good bye!");
	}

	private static String withdraw(BankAccount account, double withdraw) {
		String respond = account.withdraw(withdraw);
		if(respond == "") {
			return "Your current balnce is " + account.getBalance();
		}else {
			return respond;
		}
		
	}

	private static String deposit(BankAccount account, double deposit) {
		account.deposit(deposit);
		return "Your current balance is " + account.getBalance();
	}

	private static double accountBlance(BankAccount account) {
		return account.getBalance();
	}
}
