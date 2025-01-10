import java.util.Scanner;
class NamePrint
{
   	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
 		System.out.println("First name");
		
		String fName = sc.next();
		System.out.println("Sur name");
		String sName = sc.next();

		String fullName = fName+ " " +sName;
		System.out.println(fullName);
	}
}
