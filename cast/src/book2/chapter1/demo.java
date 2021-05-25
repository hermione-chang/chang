package book2.chapter1;
class Employee {
	public Employee() {
		System.out.println("Employee ");
	}
	public void print() {
		System.out.println("Employee Details");
	}
}
class Manager extends Employee {
	public Manager(){
		System.out.println("Manager");
	}
	public void print(){
		System.out.println("Manager Details");
	}
}
class Supervisor extends Employee {
	public Supervisor(){
		System.out.println("Supervisor");
	 }
	public void print(){
		System.out.println("Supervisor Details");
	 }
}
public class demo {
	public static void main(String[] args) {
		Employee emp1, emp2;
		Manager m1;
		Supervisor s1;
		//Upcasting
		emp1 = new Manager();
		emp2 = new Supervisor();
		//Downcating
		Employee emp3=new Manager();
		//m1 = (Manager) emp1;
		//s1 = (Supervisor) emp2;
		emp3.print();
	}
}

