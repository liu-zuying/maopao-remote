/*
 * 冒泡算法：n个数排序，比n-1趟，第一趟比n-1次，每趟比较次数逐次减一
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
		
		for(int i=0;i<num.length-1;i++)       //控制比较趟数，共length-1趟
		{
			for(int j=0;j<num.length-1-i;j++) //控制每趟比较次数，逐次减一
			{
				if(num[j]>num[j+1])				//如果右边的数比左边的大，就交换位置，每趟排出一个最大值并移到最右边
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		for(int element:  num)				//for each循环，用于输出数组元素
			System.out.print(element+" ");
	}
}

class test{
	
}
class ww{
	int i;
}
		