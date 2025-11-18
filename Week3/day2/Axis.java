package week3.day2;

public class Axis extends CreditModule{
	@Override
	public void accountCreditModule() {
		double serviceCharge = 22.40;
		balance=balance-serviceCharge;
		System.out.println("Debited : service charge for using the other bank ATM - "+serviceCharge);
		System.out.println("The current avaiable balance in the account : "+balance);
	}

	public static void main(String[] args) {
		Axis atm = new Axis();
		atm.accountCreditModule();
	}
}
