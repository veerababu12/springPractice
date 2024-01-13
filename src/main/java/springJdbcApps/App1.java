package springJdbcApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springSimpleJdbcBussiness.EmployeeBussinessImpl;
import springSimpleJdbcBussiness.EmployeeBusssiness;


public class App1 {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Configurationmetadata.xml");

        EmployeeBusssiness emp = (EmployeeBusssiness) context.getBean("employeeBusssiness");

        emp.pringAllHikes();
    }
}