package in.co.wap;

public class ExamIfElse extends Precedence {
	public static void main (StringEx [] args) {
	int marks = 55;
	
	if (marks>=90) {
		System.out.println("Grade A");
	}else if (marks>=80) {
		System.out.println("Grade B");
	}else if (marks>=70) {
		System.out.println("Grade C");
	}else {
		System.out.println("Grade D");
	}
}
}
