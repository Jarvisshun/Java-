package 最大值;

public class IFELSE1 {
	public static void main(String agrs[]){
		int a=1,b=2,c=3;
		int max;
		if (a>b) {
			if(a>c){
				max=a;
			}else max=c;
		}else if(b>c){
			max=b;
		}else max=c;
			System.out.print(max);
	}
}
