package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

	
	public static void main(String[] args) {
		
		
		// w/o predicate
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("09000105000"));
		
		
		// w/ predicate
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		
		System.out.println("Contains number 3 ? = " + 
		isPhoneNumberValidPredicate.and(containsNumber3).test("09000105000"));
		
	}
	
	
	static Predicate<String>isPhoneNumberValidPredicate = phoneNumber ->
				 phoneNumber.startsWith("07") && 
					   phoneNumber.length() == 11;
				
	static Predicate<String> containsNumber3 = phoneNumber ->
			phoneNumber.contains("3");
	
	static boolean isPhoneNumberValid (String phoneNumber){
		
		return phoneNumber.length() == 11 && phoneNumber.startsWith("07");
	}
}
