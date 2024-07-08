package 最大值;

public class IFELSE2 {
	public static void main(String agrs[]){
		int a=1,b=2,c=4;
		int max=0;
		if(a>b&&a>c){
			max=a;}
		else if(b>a&&b>c){
			max=b;}
		else if(c>a&&c>b){
			max=c;}
		System.out.print(max);
	}
}
