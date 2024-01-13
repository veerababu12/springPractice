package springSimpleJdbcBussiness;

import springSimpleJdbcDao.EmployeeDao;

import java.util.List;

import springSimpleJdbcDao.Employee;

public class EmployeeBussinessImpl implements EmployeeBusssiness {

	private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
	@Override
	public void pringAllHikes()
	{
		List<Employee> employees=employeeDao.findAllEMployees();
		
		if(employees!=null)
		{
			for(Employee employee: employees)
			{
				System.out.println("employee detais\nid="+employee.getId()+"\nname="+employee.getName()+"\nexperence="+employee.getExp());
			}
			
		}
	}

}
