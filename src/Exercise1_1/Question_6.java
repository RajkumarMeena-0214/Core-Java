package Exercise1_1;

public class Question_6 {
	public static void main (String []args) {
	int	a=0;
	int b=1;
	int c,i,count=10;
	
	System.out.println(a+b);
	
	for (i=1;i<count;++i)
  {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}
	}
}
	
	