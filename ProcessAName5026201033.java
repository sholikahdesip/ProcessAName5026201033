import java.util.Scanner;

public class ProcessAName5026201033 {
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter a First Name and Last Name: ");
		String FullName = user_input.nextLine();
		String initialName = user_input.nextLine();
		
		String FirstName = "";
		FirstName = FullName;
		
		String LastName = "";
		LastName = initialName;
		
		String NewName = "";
		NewName = initialName + FirstName;
		System.out.println("You are: " + NewName);
		
	}
}