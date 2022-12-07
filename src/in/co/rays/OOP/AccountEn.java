package in.co.rays.OOP;

public class AccountEn {
	
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber () {
		return number;
	}	
	public String getAccountType () {
		return accountType;
	}
    public Double getBalance () {
    	return balance;
    }
    
    public AccountEn (String number, String accountType, Double i ) {
    	this.number = number;
    	this.accountType = accountType;
    	this.balance = i;
    	
    }
     public void withdraw(double balance)
    {
    	this.balance=getBalance ()-balance;
    }
    public void deposit (double balance)
    {    
    	this.balance=getBalance ()+balance;
    }
    public void payBill (double balance)
    {
    	this.balance=getBalance ()-balance;
    }
    public void fundTransfer (double balance)
    {
    	this.balance=getBalance ()-balance;
    }


//Default Constractor

   public AccountEn () {
   super ();
   System.out.println("This is Default Constractor");
	   
	   
   }

}








