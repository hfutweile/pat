package pat;
import java.util.*;
public class test_1002 {
	enum exchange{ling,yi,er,san,si,wu,liu,qi,ba,jiu};
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			sum+=str.charAt(i)-'0';
		}
		String str_sum=Integer.toString(sum);
		for(int i=0;i<str_sum.length()-1;i++)
		{
			switch(str_sum.charAt(i)-'0')
			{
			case 0:
				System.out.print("ling ");
				break;
			case 1:
				System.out.print("yi ");
				break;
			case 2:
				System.out.print("er ");
				break;
			case 3:
				System.out.print("san ");
				break;
			case 4:
				System.out.print("si ");
				break;
			case 5:
				System.out.print("wu ");
				break;
			case 6:
				System.out.print("liu ");
				break;
			case 7:
				System.out.print("qi ");
				break;
			case 8:
				System.out.print("ba ");
				break;
			case 9:
				System.out.print("jiu ");
				break;
			default:
				break;		
			}
		}
		switch(str_sum.charAt(str_sum.length()-1)-'0')
		{
		case 0:
			System.out.print("ling");
			break;
		case 1:
			System.out.print("yi");
			break;
		case 2:
			System.out.print("er");
			break;
		case 3:
			System.out.print("san");
			break;
		case 4:
			System.out.print("si");
			break;
		case 5:
			System.out.print("wu");
			break;
		case 6:
			System.out.print("liu");
			break;
		case 7:
			System.out.print("qi");
			break;
		case 8:
			System.out.print("ba");
			break;
		case 9:
			System.out.print("jiu");
			break;
		default:
			break;		
		}
	}
}
