package JDBCDem.EMS;
import java.sql.SQLException;

import com.ems.dao.EmployeeDao;
import com.ems.dao.EmployeeDaoImpl;
import com.ems.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Employee emp=new Employee(130,"sanju",42,"M",98734456,"kerala","03-09-2001");
        try {
        	EmployeeDao dao=new EmployeeDaoImpl();
        	boolean result=dao.addEmployee(emp);
        	if(result==true) {
        		System.out.println("row added");
        	}
        	else {
        		System.out.println("not added");
        	}
        	dao.getEmployeelist();
        	dao.getEmployeeID(124);
        	dao.getEmployeeAge(30, 50);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
    }
}
