package java8.lambda.exceptions;

import java.util.function.BiConsumer;

public class ExceptionHandlingBiConsumer {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4 };
		int key = 0;

		process(numbers, key, wrapperLambda((v,k) -> System.out.println(v / k)));
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> bicon) {
		return (v , k) -> {
			try{
				bicon.accept(v, k);
			}
			catch(ArithmeticException e){
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> bicon) {
		for(int i : numbers){
			bicon.accept(i, key);
		}
		
	}
}
