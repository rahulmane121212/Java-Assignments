package assignments2;

class Employee {

		 void totalSalary(int salary)
		 {
			 System.out.println("Total salary: "+(salary));
		 }

}

class Manager extends Employee{
	
	double insentive = 5000;
	void totalSalary(int salary) // 30000
	 {
		System.out.println("Total salary of Manager: "+(salary + insentive));
		 
	 }
	
	
}

class Labour extends Employee{
	
	float overtime = 2;
	void totalSalary(int salary)
	 {												//30000 + 2*200 =30400
		System.out.println("Total salary of Labour: "+(salary + overtime*200)); 
	 }
	
}

class Salary{
	void calculateSalary (Employee e)
	{
		e.totalSalary(30000);
	}
}



public class Assignment2Oops{
	public static void main(String[] args)
	{

		
		Salary sal = new Salary();
		sal.calculateSalary(new Manager());
		sal.calculateSalary(new Labour());
		
		
		
	}
}
