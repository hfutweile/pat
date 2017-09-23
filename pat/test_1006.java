package pat;
import java.util.*;
public class test_1006 {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int count=0;
		if(str.length()==3)
		{
			count=str.charAt(0)-'0';
			for(int i=0;i<count;i++)
				System.out.print('B');
			count=str.charAt(1)-'0';
			for(int i=0;i<count;i++)
				System.out.print('S');
			count=str.charAt(2)-'0';
			for(int i=1;i<=count;i++)
				System.out.print(i);
		}
		if(str.length()==2)
		{
			count=str.charAt(0)-'0';
			for(int i=0;i<count;i++)
				System.out.print('S');
			count=str.charAt(1)-'0';
			for(int i=1;i<=count;i++)
				System.out.print(i);
		}
		if(str.length()==1)
		{
			count=str.charAt(0)-'0';
			for(int i=1;i<=count;i++)
				System.out.print(i);
		}
		System.out.println();
	}
}
