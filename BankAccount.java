class Account{
	double balance;

	Account(double balance){
		this.balance = balance;
	}

	public void printBalance(){
		System.out.println("Your Acc Balance : " + this.balance);
	}
}

class Operation{
	public void deposit(double amount, Account acc){
		acc.balance += amount;
		System.out.println("Deposit :  " + amount);
	} 

	public void withdraw(double amount, Account acc){
		acc.balance -= amount;
		System.out.println("Withdraw :  " + amount);
	}
}

class BankAccount{
    public static void main(String args[]){
		Account a1 = new Account(10000);
		a1.printBalance();

		Operation op = new Operation();
		op.deposit(1000, a1);
		a1.printBalance();

		op.withdraw(5000, a1);
		a1.printBalance();
    }
}
