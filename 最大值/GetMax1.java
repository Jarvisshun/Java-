package 最大值;

public class GetMax1 {
	static void Func(int a,int b,int c){
		int max=a;
		if(b>max){
			max=b;
		}
		if(c>max)
			max=c;
		System.out.print(max);
	}
	public static void main (String agrs[]){
		int temp[]=new int[3];
		int i=0;
		int max=0;
		int a=1,b=2,c=98;
		Func(a,b,c);
	}
}
