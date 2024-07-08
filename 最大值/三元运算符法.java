package 最大值;

public class 三元运算符法 {
	public static void main (String agrs[]){
		int a=1,b=41,c=3;
		int max;
		max=(a>b?a:b);
		max=(max>c?max:c);
		System.out.print(max);
	}
}
