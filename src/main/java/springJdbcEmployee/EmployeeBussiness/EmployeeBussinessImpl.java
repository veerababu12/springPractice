package springJdbcEmployee.EmployeeBussiness;

import java.util.List;

import springJdbcEmployee.EmployeeDao.EmployeeDao;

import springJdbcEmployee.EmployeeDto.Employee;

public class EmployeeBussinessImpl implements EmployeeBussiness {

	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void allEmployees() 
	{
		
		List<Employee> employees=employeeDao.retriveEmployees();
		
		if(employees!=null)
		{
			System.out.println("\n All Employees details......\n");
			for(Employee employee:employees)
			{
				System.out.println("id="+employee.getId()+"\tname="+employee.getName()+"\tdepartment="+employee.getDepartment()+"\texperience="+employee.getExperience()+"\tsalary"+employee.getSalary());
			}
		}
		else
		{
			System.out.println("No employees...");
		}
	}
	
	@Override
	public void addEmployee(Employee employee) 
	{
		employeeDao.insertEmployee(employee);
		
	}

	

	@Override
	public void employeeById(String id) {
		
		Employee employee=employeeDao.retriveEmployeeById(id);
		
		System.out.println("\n Specific Employee details......\n");
		
		
			System.out.println("id="+employee.getId()+"\tname="+employee.getName()+"\tdepartment="+employee.getDepartment()+"\texperience="+employee.getExperience()+"\tsalary"+employee.getSalary());
		
		
	}

}
