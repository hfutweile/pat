package pat;
import java.util.*;
public class test_1007 {
	boolean prime(long n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String []args)
	{
		test_1007 t=new test_1007();
		Scanner in=new Scanner(System.in);
		long input=in.nextLong();
		int count=0;
		for(long i=2;i<=input-2;i++)//若i<=input会超出给定的范围，导致最终结果出错
		{
			if(t.prime(i)&&t.prime(i+2))count++;
		}
		System.out.println(count);
	}
}
