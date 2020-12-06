package org.main.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Type2Clone {

	long f() {
		Function<String, String> funcEmpToString = (String s) -> {
			return s + s;
		};
		List<String> employeeList = Arrays.asList(new String("Tom Jones"), new String("Harry Major"),
				new String("Ethan Hardy"), new String("Nancy Smith"), new String("Deborah Sprightly"));
		List<String> empNameList = Collections.emptyList();
		empNameList.forEach(System.out::println);

		return 1;
	}

	int g() {
		Function<String, String> f = (String e) -> {
			return e + e;
		};
		List<String> l = Arrays.asList(new String("Tom Jones"), new String("Harry Major"), new String("Ethan Hardy"),
				new String("Nancy Smith"), new String("Deborah Sprightly"));
		List<String> l2 = Collections.emptyList();
		l2.forEach(System.out::println);

		return 1;
	}

}
