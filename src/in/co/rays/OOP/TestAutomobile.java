package in.co.rays.OOP;

public class TestAutomobile {
	
	public static void main (String []args) {
		
		AutomobileEn en = new AutomobileEn ();
		
		en.setColor ("Black");
		en.setSpeed (180);
		en.setMake("Maruti");
		en.setNo_of_gears(6);
		
		String Color = en.getColor();
		System.out.println (Color);
		
		int Speed =en.getSpeed ();
		System.out.println (Speed);
		
		String Make = en.getMake();
		System.out.println(Make);
		
		int No_of_gears = en. getNo_of_gears();
		System.out.println(No_of_gears);
	}

}
