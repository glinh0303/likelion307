package ex307;

import java.util.function.Function;

public class bai2 {

	public static void main(String[] args) {
		Function<Integer, StringBuilder> convertToBinary = number -> {
			return toBinary(number);
		};

		System.out.println(convertToBinary.apply(33));
		System.out.println(convertToBinary.apply(747));
	}

	public static StringBuilder toBinary(int number) {
		StringBuilder s = new StringBuilder();
		while (number > 0) {
			int n = number % 2;
			number /= 2;
			s.append(n);
		}
		return s.reverse();
	}
}
