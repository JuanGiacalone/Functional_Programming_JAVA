package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	public static void main(String[] args) {
		
		//normal java funct
		greetCostumer(new Customer("juan", "909250"));
		
		
		//functional interface consumer
		greetCustomerConsumer.accept(new Customer("pablo", "250250"));
		
		greetCustomerBiConsumer.accept(new Customer("maria","566666"), false);
		greetCustomerBiConsumer.accept(new Customer("marix","696969"), true);
	}
	
	
	
	static void greetCostumer (Customer customer){
		
		System.out.println("hello" + customer.customerName 
							+ ", Thanks for registering " 
							+ customer.customerPhoneNumber);
	}
	
	static Consumer<Customer> greetCustomerConsumer = customer ->
	System.out.println("hello" + customer.customerName 
			+ ", Thanks for registering " 
			+ customer.customerPhoneNumber);
	
	
	static BiConsumer<Customer, Boolean> greetCustomerBiConsumer 
										= (customer, showPhoneNumb) ->
	System.out.println("hello" + customer.customerName 
			+ ", Thanks for registering " 
			+ (showPhoneNumb ? customer.customerPhoneNumber : "******"));
	
	static class Customer{
		
		private final String customerName;
		private final String customerPhoneNumber;
		
		public Customer(String customerName, String customerPhoneNumber) {
			super();
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
	}
}
