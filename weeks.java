import java.util.Scanner;
class weeks
{
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		int year,weeks,days,remain;
		System.out.println("enter the days:");
		days=in.nextInt();
		year=days/365;
		weeks=(days%365)/7;
		remain=days-(year*365)-(weeks*7);
		System.out.println("days="+days);
		System.out.println("weeks="+weeks);
		System.out.println("year="+year);
		System.out.println("remaining days:"+remain);
	}

}