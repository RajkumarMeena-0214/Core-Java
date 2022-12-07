package in.co.rays.OOP;

public class Student extends PersonInheri {
	
	private String RollNo;
	private int marks;
	
	public String getRollNo () {
		return RollNo;
	}
	public void setRollNo (String RollNo) {
        this.RollNo=RollNo;                                 
}
	public int getmarks () {
		return marks;
	}
    public void setmarks (int marks) {
    	this.marks=marks;
    }
}