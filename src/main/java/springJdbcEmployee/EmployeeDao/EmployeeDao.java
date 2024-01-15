package springJdbcEmployee.EmployeeDao;

import java.util.List;

import springJdbcEmployee.EmployeeDto.Employee;

public interface EmployeeDao 
{
	void insertEmployee(Employee employee);
	
	List<Employee> retriveEmployees();
	
	Employee retriveEmployeeById(String id);
	
	

}
