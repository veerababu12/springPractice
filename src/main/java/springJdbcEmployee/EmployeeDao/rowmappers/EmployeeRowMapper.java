package springJdbcEmployee.EmployeeDao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springJdbcEmployee.EmployeeDto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Employee employee=new Employee();
		
		employee.setId(rs.getString(1));
		employee.setName(rs.getString(2));
		employee.setDepartment(rs.getString(3));
		employee.setExperience(rs.getDouble(4));
		employee.setSalary(rs.getDouble(5));
		
		
		return employee;
	}

}
