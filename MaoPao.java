/*
 * ð���㷨��n�������򣬱�n-1�ˣ���һ�˱�n-1�Σ�ÿ�˱Ƚϴ�����μ�һ
 */
import java.util.*;


public class MaoPao{
	
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
		
		//���ƱȽ���������length-1��		
		for(int i=0;i<num.length-1;i++)      
		{			
			//����ÿ�˱Ƚϴ�������μ�һ			
			for(int j=0;j<num.length-1-i;j++) 
			{				
				//����ұߵ�������ߵĴ󣬾ͽ���λ�ã�ÿ���ų�һ�����ֵ���Ƶ����ұ�				
				if(num[j]>num[j+1])				
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		//for eachѭ���������������Ԫ��		
		for(int element:  num)				
		{
			System.out.print(element+" ");
		}
	}
}
		