/*
 * ð���㷨��n�������򣬱�n-1�ˣ���һ�˱�n-1�Σ�ÿ�˱Ƚϴ�����μ�һ
 */
import java.util.*;

public class maopao{
	
	public static void main(String[] args)
	{
		int[] num= new int[10];
        int temp;

		Scanner in = new Scanner(System.in);
			
		for(int k=0;k<num.length;k++)
		{
			num[k]=in.nextInt();			
		}
		in.close();
		
		for(int i=0;i<num.length-1;i++)       //���ƱȽ���������length-1��
		{
			for(int j=0;j<num.length-1-i;j++) //����ÿ�˱Ƚϴ�������μ�һ
			{
				if(num[j]>num[j+1])				//����ұߵ�������ߵĴ󣬾ͽ���λ�ã�ÿ���ų�һ�����ֵ���Ƶ����ұ�
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		for(int element:  num)				//for eachѭ���������������Ԫ��
			System.out.print(element+" ");
	}
}

class test{
	
}
class ww{
	int i;
}
		