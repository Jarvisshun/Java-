package 最大值;

public class IF2 {
	public static void main(String agrs[]){
		int a=1,b=2,c=5;
		int max=0;
		if(a>max) {
			max=a;
			if(b>max){
				max=b;
			if(c>max){	
				max=c;
			}
			}
		}
		System.out.print(max);
	}
}
