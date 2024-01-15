package springSimpleJdbcDao;

public class Employee {

		int id;
		String name;
		String exp;
		
		public Employee()
		{
			
		}
		
		public Employee(int id,String name,String exp)
		{
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getExp() {
			return exp;
		}
		public void setExp(String exp) {
			this.exp = exp;
		}

		

	

}
