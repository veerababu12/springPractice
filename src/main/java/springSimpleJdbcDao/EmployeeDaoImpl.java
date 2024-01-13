package springSimpleJdbcDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void insertEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEMployees() 
	{
		List<Employee> employees=new ArrayList<Employee>(); //empty list to return rows to bussinessimpl
		   
		try
		{
			  Class.forName("com.mysql.cj.jdbc.Driver");

	          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "");

	          Statement stmt = con.createStatement();

	          String query = "SELECT * FROM Employee";
	          
	          ResultSet rs = stmt.executeQuery(query);
	          
	       
	          
	          while(rs.next())
	          {
	        	  int id = rs.getInt(1); 
	              String name = rs.getString(2); 
	              String exp = rs.getString(3);

	              Employee employee = new Employee(id, name, exp);

	              employees.add(employee);
	        	  
	        	  
	          }
	          
		}
		catch(Exception e)
		{
			
		}
		return employees;
	}

	@Override
	public void byId(int id) 
	{
		// TODO Auto-generated method stub
		
	}

}
