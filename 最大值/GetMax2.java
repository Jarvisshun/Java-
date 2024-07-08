package 最大值;

public class GetMax2 {
	static int Func2(int a,int b,int c){
		int max=a;
		if(b>max){
			max=b;
		}
		if(c>max)
			max=c;
		return max;
	}
	public static void main (String agrs[]){
		int a=1,b=2,c=54;
		int max;
		max=Func2(a,b,c);
		System.out.print(max);
	}
}