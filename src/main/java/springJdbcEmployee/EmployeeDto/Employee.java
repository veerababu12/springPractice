package springJdbcEmployee.EmployeeDto;

public class Employee {

	
		private String id;
		private String name;
		private String department;
		private double experience;
		private double salary;
		
		// Constructor
	    public Employee(String id, String name, String department, double experience, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.experience = experience;
	        this.salary = salary;
	    }
	    
	    
		public Employee() {
			// TODO Auto-generated constructor stub
		}


		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		
		public double getExperience() {
			return experience;
		}
		
		public void setExperience(double experience) {
			this.experience = experience;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}


	
		

		
		

	

}
