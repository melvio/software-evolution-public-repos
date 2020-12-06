package org.main.a;

public class Type1CloneConstruct {

	public Type1CloneConstruct(int x, int y, String u) {
		
		
		for (int i = 0 ; i < x ; x = x + y, y = x + y) {
			if (x > y) {
				continue;
			} else if (x * y > x || true) {
				throw new OutOfMemoryError(u);
			}
			else {
				x = y >> x;
				break;
			}

		}
	}

	public Type1CloneConstruct(int x, String u) {
		int y = 3;
		
		for (int i = 0 ; i < x ; x = x + y, y = x + y) {
			if (x > y) {
				continue;
			} else if (x * y > x || true) {
				throw new OutOfMemoryError(u);
			}
			else {
				x = y >> x;
				break;
			}

		}
		
	}
	
}
