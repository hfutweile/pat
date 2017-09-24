package pat;
import java.util.*;
public class test_1009 {
	public static void main(String []args)
	{
		String input=new String();
		Scanner in=new Scanner(System.in);
		input=in.nextLine();
		int count=0;
		int length=input.length();
		for(int i=length-1;i>=0;i--)
		{
			if(i==0)
			{
				for(int j=0;j<=count;j++)
					System.out.print(input.charAt(i+j));
			}
			if(input.charAt(i)!=' ')
			{
				count++;
			}
			else if(input.charAt(i)==' ')
			{
				for(int j=1;j<=count;j++)
					System.out.print(input.charAt(i+j));
				System.out.print(input.charAt(i));
				count=0;
			}
		}
	}
}
