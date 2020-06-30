package kunli.entity;

public class BankAccount {
	
	private int accountNumber;
	
	private double balance;
	
	private String customerName;
	
	private String email;
	
	private String phoneNumber;
	
	public BankAccount() {
		this.accountNumber = 123456789;
		this.balance = 50.0;
		this.customerName = "KunLi";
		this.email = "xxxx@gmail.com";
		this.phoneNumber = "6145788789";
	}
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	public String withdraw(double withdraw) {
		if(withdraw > this.balance) {
			return "balance is not enough! " + this.customerName + " " + this.balance;
		}else {
			this.balance -= withdraw;
			return "";
		}
	}
	
}

