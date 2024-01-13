package springSimpleJdbcDao;

import java.util.List;

public interface EmployeeDao 
{
	void insertEmployee(Employee employee);
	
	List<Employee> findAllEMployees();
	
	void byId(int id);

}
