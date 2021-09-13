package patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

import patterns.structural.filter.entity.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = persons.stream()
				.filter(person -> person.getMaritalStatus().equalsIgnoreCase("SINGLE")).collect(Collectors.toList());
		return singlePersons;
	}
}
