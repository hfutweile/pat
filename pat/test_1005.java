package pat;
//˼·�����ζ�����������в�����㣬ÿһ������������и�������������
//�����ǵ����Ͳ����в�����㣬����ʣ�µ�����Ϊ����
import java.util.*;
public class test_1005 {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []arr=new int[n];
		int []arrCopy=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			arrCopy[i]=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			if(arrCopy[i]==1)continue;
			while(arr[i]!=1)
			{
				if(arr[i]%2==0)
				{
					arr[i]=arr[i]/2;
					for(int k=0;k<n;k++)
					{
						if(arr[i]==arrCopy[k])
							arrCopy[k]=1;
					}
				}
				else
				{
					arr[i]=(arr[i]*3+1)/2;
					for(int k=0;k<n;k++)
					{
						if(arr[i]==arrCopy[k])
							arrCopy[k]=1;
					}
				}
			}
		}
		int temp;
		int count=0;
		for(int i=0;i<n;i++)
			if(arrCopy[i]!=1)count++;;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arrCopy[i]<arrCopy[j])
				{
					temp=arrCopy[i];
					arrCopy[i]=arrCopy[j];
					arrCopy[j]=temp;
				}
			}
		}
		for(int i=0;i<count-1;i++)
		{
			System.out.print(arrCopy[i]+" ");
		}
		System.out.println(arrCopy[count-1]);
	}
}
