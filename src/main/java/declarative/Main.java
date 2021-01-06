package declarative;



import static declarative.Main.Gender.FEMALE;
import static declarative.Main.Gender.MALE;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;


/**
 * 
 * @author JuanPabloGiacalone
 *
 */
public class Main {

	public static void main(String[] args) {
        List<Person> people = List.of (
                new Person("John", MALE),
                new Person("JohnATAN", MALE),
                new Person("JMARIE", FEMALE),
                new Person("KRISA", FEMALE),
                new Person("JohnCITO", MALE)
        );
	
	
	//Declarative approach
        
      /* people.stream()
        .filter(person -> FEMALE.equals(person.gender))
        .collect(Collectors.toList())
        .forEach(System.out::println);*/
        
        
       /* List<Person> females = people.stream()
        .filter(person -> FEMALE.equals(person.gender))
        .collect(Collectors.toList());
        
        
        females.forEach(System.out::println); */
        
      //Declarative approach with predicate 
        
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        
        List<Person> females = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        
        females.forEach(System.out::println);
	}
	
   static class Person {
       private final String name;
       private final Gender gender;

       Person(String name, Gender gender) {
           this.name = name;
           this.gender = gender;
       }

       @Override
       public String toString() {
           return "Person{" +
                   "name='" + name + '\'' +
                   ", gender=" + gender +
                   '}';
       }
   }

   enum Gender {
       MALE,FEMALE
   }


}
