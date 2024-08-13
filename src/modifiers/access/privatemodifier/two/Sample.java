package modifiers.access.privatemodifier.two;

public class Sample {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setSalary(500000);
		
		System.out.println(employee.getSalary());
		
		employee.setSalary(1000000);
		
		System.out.println(employee.getSalary());

	}

}
