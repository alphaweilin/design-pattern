package patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

import patterns.structural.filter.entity.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = persons.stream().filter(person -> person.getGender().equalsIgnoreCase("FEMALE"))
				.collect(Collectors.toList());
		return femalePersons;
	}
}