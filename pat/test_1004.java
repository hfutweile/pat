package pat;
import java.util.*;
public class test_1004 {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		student []stu=new student[n];
		for(int i=0;i<n;i++)
		{
			stu[i]=new student();
			stu[i].setValue(in.next(),in.next(),in.nextInt());
		}
		int scoreBest=0;
		int scoreLeast=0;
		//排序不能使用双层循环，使用查找下标会提高程序效率
		for(int i=1;i<n;i++)
		{
			if(stu[i].score<stu[scoreLeast].score)
				scoreLeast=i;
			if(stu[i].score>stu[scoreBest].score)
				scoreBest=i;
		}
		in.close();
		System.out.println(stu[scoreBest].name+" "+stu[scoreBest].number);
		System.out.println(stu[scoreLeast].name+" "+stu[scoreLeast].number);
	}
}
class student
{
	String name;
	String number;
	int score=0;
	void setValue(String name,String number,int score)
	{
		this.name=name;
		this.number=number;
		this.score=score;
	}
}