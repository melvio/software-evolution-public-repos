public class DuplicationExamples2 {
	
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
}

