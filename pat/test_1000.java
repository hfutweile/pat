package pat;
import java.util.*;
public class test_1000 {
	public static void main(String []args)
	{
		Scanner inInt=new Scanner(System.in);
		int input=inInt.nextInt();
		int count=0;
		while(input!=1)
		{
			if(input%2==0)input=input/2;
			else 
			{
				input=(input*3+1)/2;
			}
			count++;
		}
		System.out.println(count);
	}
}
