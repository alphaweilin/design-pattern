package patterns.structural.composite;

import java.util.LinkedList;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		// 打印该组织的所有员工
//		System.out.println(CEO);
//		for (Employee headEmployee : CEO.getSubordinates()) {
//			System.out.println(headEmployee);
//			for (Employee employee : headEmployee.getSubordinates()) {
//				System.out.println(employee);
//			}
//		}
		
		showEmployee2(CEO);
	}
	
	/**
	 * 使用递归遍历--深度有限
	 * @param employee
	 */
	private static void showEmployee(Employee employee){
		System.out.println(employee);
		if(null != employee.getSubordinates()) {
			employee.getSubordinates().forEach(item->showEmployee(item));
		}
		return;
	}
	
	private static void showEmployee2(Employee employee) {
		LinkedList<Employee> quenue = new LinkedList<Employee>();
		
		if (null != employee) {
			quenue.add(employee);
		}
		
		while (!quenue.isEmpty()) {
			Employee item = quenue.remove();
			System.out.println(item);
			if (null != item.getSubordinates()) {
				item.getSubordinates().forEach(subitem -> quenue.add(subitem));
			}
		}
	}
}