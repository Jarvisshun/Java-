package zhx;
import java.util.Scanner;
public class TestMax {
	public static void main(String args[]) {
		int a,b,c,max=0;
		Scanner in=new Scanner(System.in);
		
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		//函数调用 实参
		max=max3(a,b,c);
		//max=max3(a,b);
	
		System.out.println(max);
	}
	//函数定义 形参
	public static int max3(int a,int b){
		int c,max;
		c=30000;
		max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
	public static int max3(int a,int b,int c){
		int max;
		max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
}

