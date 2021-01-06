package functionalInterface;

import java.util.function.*;

public class _Function {

	public static void main(String[] args) {
		
		//function example takes 1 and returns 1 result
		
		int increment = incrementByOne(2);
		System.out.println(increment);
		
		int increment2 = incrementByOneFunction.apply(1);
		
		System.out.println(increment2);
		
		int multiply = multiplyBy10Function.apply(increment2);
		
		System.out.println(multiply);
		
		//combinacion de funciones
		Function<Integer,Integer> addBy1AndMultiply = incrementByOneFunction.andThen(multiplyBy10Function);
		
		System.out.println(addBy1AndMultiply.apply(increment));
		
		//bifunction (takes 2 args)
		
		System.out.println(addBy1AndMultiplyBiFunction.apply(4, 100));
	}
	
	
	static Function<Integer, Integer> incrementByOneFunction = 
			number -> number++;
			
	static Function<Integer, Integer> multiplyBy10Function = 
			number -> number * 10;
	
	static int incrementByOne(int number) {
		 
		return number + 1 ;
	}
	
	
	
	static BiFunction<Integer, Integer, Integer> addBy1AndMultiplyBiFunction =
			(numberToIncrementByOne, numberToMultiplyBy) 
			-> ( numberToIncrementByOne + 1) * numberToMultiplyBy;
	
	static int increment1AndMultiply(int number, int product) {
		 
		return (number + 1) * product ;
	}
}
