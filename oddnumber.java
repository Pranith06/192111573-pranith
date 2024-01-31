import java.util.Scanner;
class oddnumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		int n = s.nextInt();
        int arr[]=new int[100];
		int j=1;
		for(int i=1; i<100; i++)
		{
			if(i%2!=0) {
				arr[j]=i;
				j++;
			}
		}
		System.out.print(arr[n*2]);
}
}