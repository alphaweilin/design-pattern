package patterns.structural.filter;

import java.util.List;

import patterns.structural.filter.entity.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}