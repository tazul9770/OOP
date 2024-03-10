public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId(202);
        employee.setName("Tazul Islam");
        employee.setSalary(120000);

        System.out.println("Details: ");
        employee.printInfo();
    }
}
class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void printInfo() {
		System.out.println("ID: " +getId());
		System.out.println("Name: " +getName());
		System.out.println("Salary: " +getSalary());
	}
}