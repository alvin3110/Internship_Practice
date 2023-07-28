package bitlabs.SMS;

import java.sql.SQLException;
import java.util.Scanner;

import com.bitlabs.dao.StudentDaoImpl;
import com.bitlabs.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        StudentDaoImpl dao=new StudentDaoImpl();
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=5) {
        	System.out.println("1.Add Student");
        	System.out.println("2.Display Students");
            System.out.println("3.display student by id");
            System.out.println("4.Update");
        	System.out.println("5.Delete Student");
        	System.out.println("6.Exit");
        	System.out.print("Enter your choice:");
        	choice=sc.nextInt();
        	switch(choice) 
        	{
        	  case 1:
        	  {
        		 System.out.println("Enter student details");
        		 Student st=new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next());
        		 int result=dao.addStudent(st);
        		 if(result>0) 
        		 {
        			System.out.println("added");
        		 }
        		 else 
        		 {
        			System.out.println("not added");

        	     }
        		 break;
        	  }
        	  case 2:
        	  {
        		  dao.getStudent();
        		  break;
        	  }
        	  case 3:
        	  {
        		  System.out.print("Enter sid:");
    			  int id=sc.nextInt();
    			  dao.getStudentbyID(id);
    			  break;
        	  }
        	  case 4:
        	  {
        		  System.out.println("Enter id and updated name");
        		  dao.updateStudentById(sc.nextInt(), sc.next());
        		  break;

        	  }
        	  case 5:
        	  {
        		  //System.out.println("Delete with 1.sid /n 2.name");
        		  //System.out.print("Enter your choice:");
        		  //int dchoice=sc.nextInt();
        		  //if(dchoice==1) {
        			  System.out.print("Enter sid:");
        			  int id=sc.nextInt();
        			  dao.deleteStudentById(id);
        		  //}
        			  break;
        		  
        	  }
        	  case 6:
        	  {
        		  System.out.println("Thank You");
        		  break;
        	  }
        	  default:System.out.println("Invalid choice");
        	}
        	
        }
    }
}
