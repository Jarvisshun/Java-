package zhx;

public class TestSushu {
	public static void main(String args[]) {
		int num,i;
		for(num=1;num<=100;num++) {
			for(i=2;i<=num-1;i++) {
				if(num%i==0)
					break;
			}
			if(i==num) {
				System.out.println(num+"yes");
			}
		}
				
	}
}
