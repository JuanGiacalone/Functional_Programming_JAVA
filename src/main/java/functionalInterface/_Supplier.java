package functionalInterface;

import java.util.function.Supplier;

import java.util.List;

public class _Supplier {
	
	public static void main(String[] args) {
		
		
		// normal 
		System.out.println(getDBConnectionUrl());
		
		
		// functional with supplier
		System.out.println(getDBConnectionUrlSupplier.get());
		
	}

	static String getDBConnectionUrl() {
		
		return "jdbc://localhost:5432/users";
	}
	
	static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
				
				List.of(
						"jdbc://localhost:5432/users",
						"jdbc://localhost:5432/costumers");
		
}
