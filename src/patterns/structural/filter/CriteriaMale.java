package patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

import patterns.structural.filter.entity.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = persons.stream().filter(person -> person.getGender().equalsIgnoreCase("MALE"))
				.collect(Collectors.toList());
		return malePersons;
	}
}
