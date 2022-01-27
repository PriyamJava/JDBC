import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("Press 1 to add student");
		System.out.println("Press 2 to delete student");
		System.out.println("Press 3 to display student information");
		System.out.println("Press 4 to exit the app");
		
		int choice=Integer.parseInt(br.readLine());
		
		
		if(choice==1) {
			
			
		}
		else if(choice==2) {
			
		}
		
		else if(choice ==3) {
			
			
		}
		else if(choice==4) {
			break;
		}
		else {
			
			
		}
		}
       System.out.println("Thanks for using my application....");
       System.out.println("Seee Yoo Soon...");
	}

}
