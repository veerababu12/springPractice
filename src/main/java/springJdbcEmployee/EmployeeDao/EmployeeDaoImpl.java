package springJdbcEmployee.EmployeeDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import springJdbcEmployee.EmployeeDao.rowmappers.EmployeeRowMapper;
import springJdbcEmployee.EmployeeDto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertEmployee(Employee employee) 
	{
	   String query="insert into Employees values(?,?,?,?,?)";
	   
	   jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getDepartment(),employee.getExperience(),employee.getSalary());
	   
	   System.out.println("New Employee data inserted....");
		
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> retriveEmployees()
	{
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		
		List<Employee> employees=jdbcTemplate.query("select * from Employees",rowMapper);
		
		return employees;
	}

	@Override
	public Employee retriveEmployeeById(String id)
	{
        EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		
		Employee employee=jdbcTemplate.queryForObject("select * from Employees where id=?",rowMapper,id);
		
		return employee;
	}

}
