 package in.co.rays.OOP;

public class TestAccount {
	
	public static void main (String []args) {
		
		AccountEn en = new AccountEn ("52731-8000-296", "Saving Account", 500.0) ;
		
		
	    String n = en.getNumber();
		System.out.println(n);
		
		String ac = en.getAccountType();
		System.out.println(ac);
		
		Double d = en.getBalance();
		System.out.println(d);
		
		
		en.withdraw(200);
		System.out.println(en.getBalance());
		
		en.deposit(1000);
		System.out.println(en.getBalance());
		
		en.payBill(600);
		System.out.println(en.getBalance());
		
		en.fundTransfer(400);
		System.out.println(en.getBalance());
	

	
}
}