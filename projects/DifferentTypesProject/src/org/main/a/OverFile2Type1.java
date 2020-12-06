package org.main.a;

public class OverFile2Type1 {
	
	public static Object f (short x, byte y ) throws Throwable {
		if (x + y > 3 || x + y < -2) {
			System.exit(10);
			return new Integer(0);

		} else {
			Thread.sleep(1337);
			return new Error("oeps");
		}
		
	}

}
