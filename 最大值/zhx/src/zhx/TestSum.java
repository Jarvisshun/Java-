package zhx;
import java.util.Scanner;
public class TestSum {
	public static void main(String args[]) {
		int sum,num;
		Scanner in=new Scanner(System.in);
		System.out.println("������num:");
		num=in.nextInt();
		sum=qiuhe(num);
		System.out.println(num+"�Ľ׳˺��ǣ�"+sum);
	}
	public static int qiuhe(int num){
		int i,sum=0,temp=1;
		for(i=1;i<=num;i++) {
			temp=temp*i;
			sum+=temp;
		}
		return sum;
	}
}
