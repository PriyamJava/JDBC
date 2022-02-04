import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;//important libries
import java.sql.SQLException;

import com.student.manage.Student;
import com.student.manage.StudentD;


public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("Press 1 to add student");
		System.out.println("Press 2 to delete student");
		System.out.println("Press 3 to display student information");
		System.out.println("Press 4 to exit the app");
		
		int choice=Integer.parseInt(br.readLine());
		
		
		if(choice==1) {
			//add student
			
			
			System.out.println("Enter student name: ");
			String name=br.readLine();
			
			System.out.println("Enter student phone: ");
			String phone=br.readLine();
			
			System.out.println("Enter student city: ");
			String city=br.readLine();
			
			Student st=new Student(name,phone,city);
			
			boolean answer=StudentD.insertStudentToDb(st);
			if(answer) {
				System.out.println("Student added successfully");
			}
			else {
				System.out.println("Something went wrong try again..");
			}
			System.out.println(st);
			
		}
		else if(choice==2) {
			//delete student
			System.out.println("Enter student id to delete: ");
			int userId=Integer.parseInt(br.readLine());
			boolean deleteStudent = StudentD.deleteStudent(userId);
			if (deleteStudent)
			{
				System.out.println("Student deleted successfully");
				}
			else
			{
				System.out.println("Something went wrrong");
			}
			
			
		}
		
		else if(choice ==3) {
			//display students
			StudentD.showAllStudents();
			
		}
		else if(choice==4) {
			break;
		}
		else {
			System.out.println("Please provide the valid choice!");
			
			
		}
		}
       System.out.println("Thanks for using my application....");
       System.out.println("Seee Yoo Soon...");
	}

}
