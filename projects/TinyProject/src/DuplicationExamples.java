
public class DuplicationExamples {
	
	public void testAgainstOtherClass() {
		boolean b = false;
		if (b && true) {
			System.out.println("This is true");
		} 
		b = false;
		System.out.println("This is false");
		System.out.println("This is false");
		System.out.println("This is false");
		System.out.println("This is false");
		System.out.println("This is false");
		System.out.println("This is false");
		System.out.println("This is false");
		System.out.println("This is false");
		return;
	}
	
	public DuplicationExamples() {
	     int month = 8;
	     String monthString;
	     switch (month) {
	         case 11: monthString = "November";
	                  break;
	         case 12: monthString = "December";
	                  break;
	         default: monthString = "Invalid month";
	                  break;
	     }
	     System.out.println(monthString);
		
	}
	
	
	static {
	     int month =9;
	     String monthString;
	     switch (month) {
	         case 11: monthString = "November";
	                  break;
	         case 12: monthString = "December";
	                  break;
	         default: monthString = "Invalid month";
	                  break;
	     }
	     System.out.println(monthString);
		
	}
	

}