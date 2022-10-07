package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("짱구", 23, "010-1234-1234"));
		personList.add(new Person("유리", 24, "010-1234-1234"));
		personList.add(new Person("철수", 12, "010-1234-4652"));
		personList.add(new Person("맹구", 23, null));
		
		// Function.identity는 t -> t, 항상 입력된 인자(자신)를 반환합니다.
		Map<String, Person> personMap = personList.stream()
				.collect(Collectors.toMap(Person::getName, Function.identity()));

		
		Map<String,Person> personMap2 = personList.stream()
				.collect(Collectors.toMap(new Function<Person, String>(){

					@Override
					public String apply(Person person) {
						// TODO Auto-generated method stub
						return person.getName();
					}
					
				}, new Function<Person, Person>() {

					@Override
					public Person apply(Person person) {
						// TODO Auto-generated method stub
						return person;
					}
					
				}));
	}

}
