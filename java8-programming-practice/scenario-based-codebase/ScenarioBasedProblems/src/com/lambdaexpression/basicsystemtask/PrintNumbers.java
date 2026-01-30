// Use lambda to print numbers from a list.

package com.lambdaexpression.basicsystemtask;

import java.util.*;

public class PrintNumbers {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(20, 5, 21, 76, 88);
		list.forEach(printNumbers -> System.out.println(printNumbers));
	}
}
