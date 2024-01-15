package springJdbcEmployee.EmployeeBussiness;

import springJdbcEmployee.EmployeeDto.Employee;

public interface EmployeeBussiness
{
	void addEmployee(Employee employee);
	
	void allEmployees();
	
	void employeeById(String id);

}
