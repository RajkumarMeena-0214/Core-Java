package in.co.rays.OOP;

public class PersonInheri {
	
	private String name;
	private String address;
	private int dob;
	
	public String getname () {
		return name;
	}	
    public void setname (String name) {
    	this.name=name;
    }
    public String getaddress () {
    	return address;
    }	
    public void setaddress (String address) {
    	this.address=address;
	}
    public int setdob () {
    	return dob;
    }
    public void setdob (int dob) {
    	this.dob=dob;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
