import java.util.Scanner;
public class vowel
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the string:");
		String s = input.nextLine();
		int len = s.length();
		char a[] = new char[len];
        int vow = 0;
		for(int i=0;i<len;i++)
{
 a[i]=s.charAt(i);
 if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'
 ||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
 vow=vow+1;
}
System.out.println(vow);
}
}