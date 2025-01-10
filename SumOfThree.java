import java.util.Scanner;
class SumOfThree 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("first no is");
		int a = sc.nextInt();

		System.out.println("second no is");
		int b = sc.nextInt();

		System.out.println("third no is");
		int c = sc.nextInt();

		int sum = a+b+c;
		System.out.println(sum);

	}
}
