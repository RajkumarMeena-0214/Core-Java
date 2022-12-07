package in.co.rays.OOP;

public class TestShapeInheri {
	
	public static void main (String []args) {
		
		CircleEx c = new CircleEx ();
		RectangleEx r = new RectangleEx ();	
		TringleEx t = new TringleEx ();
		
		c.setColor("red");
		String color = c.getcolor();
		System.out.println("Color of Shape Circle is " + color);
	
		//ShapeInheri s = new CircleEx ();
		
		c.setRadius(2);
		double d = c.area();
		
		System.out.println("Radius of  circle :" +c.getRadius());
		System.out.println("Area of circle is " + d);
	
		r.setLength (12);
		r.setWidth(10);
		double d1 = r. area();
		
		System.out.println("Lenght of rectengle is : " + r.getLength());
		System.out.println("Width of Rectengle is : "+ r.getWidth());
		System.out.println(d1);
		
		
		t.setBase (6);
		t.setHeight (2);
		double d2 = t.area();
		
		System.out.println("Base of Tringle is : "+ t.getBase());
        System.out.println("Height of Tringle is :"+ t.getHeight());	
        System.out.println(d2);
	}
	
}
