
public class DuplClass {
	
	public static int signature1(int x, long y) {
		if (x == y) {
			return (int)(x * y);
		} else if (x > y) {
			return x;
		} else {
			return (int)y + x;
		}
	}

}
