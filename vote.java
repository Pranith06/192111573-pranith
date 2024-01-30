import java.util.Scanner;
class vote
{
	public static void main(String[] args)
{
	Scanner Scanner = new Scanner(System.in);
	int age = Scanner.nextInt();
	int yearsLeft = 18-age;
	if(age>=18){
		System.out.println("you are eligible to vote");
}
else{
	System.out.println("you are not eligible to vote");
	System.out.println("you need to wait "+yearsLeft + " more years to be eligible");
}
}
}