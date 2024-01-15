package springJdbcEmployee.EmployeeDto;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springJdbcEmployee.EmployeeBussiness.EmployeeBussinessImpl;




public class App
{
	 public static void main(String[] args)
	{
	 ApplicationContext context = new ClassPathXmlApplicationContext("springJdbcEmployee/cmdEmployee.xml");

     EmployeeBussinessImpl emp = (EmployeeBussinessImpl) context.getBean("employeeBussiness");
     
     int choice=-1;
     
     Scanner sc=new Scanner(System.in);
     
     while(choice!=4)
     {
         System.out.println("Enter choice...\n\n1.Add Employee\n2.Get All Employee details\n3.Get Specific Employee\n4.Exit");
          
         choice=sc.nextInt();
         
         if(choice==1)
         { 
        	 System.out.println("Enter Employee id=");
        	 
        	 String id = sc.next();
        	 
        	 System.out.println("Enter Employee name=");
             String name = sc.next();

             System.out.println("Enter Employee department=");
             String department = sc.next();

             System.out.println("Enter Employee experience=");
             double experience = sc.nextDouble();

             System.out.println("Enter Employee salary=");
             double salary = sc.nextDouble();

             Employee employee = new Employee();
             employee.setId(id);
             employee.setName(name);
             employee.setDepartment(department);
             employee.setExperience(experience);
             employee.setSalary(salary);

              
        	              
             emp.addEmployee(employee);
             
         }
         
         else if(choice==2)
         {
        	  emp.allEmployees();
         }
         else if(choice==3)
         {
        	 
             System.out.println("Enter Employee id=");
        	 
        	 String id = sc.next();
        	 
        	 Employee employee = new Employee();
             employee.setId(id);
             
             emp.employeeById(id);
             
         }
         else if(choice==4)
         {
        	 break;
         }
         else
         {
        	 System.out.println("Enter correct choice..");
         }
         

     }

     sc.close();
      
    
    
	}

}
