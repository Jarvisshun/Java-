package 最大值;

public class For循环数组填数1 {
	public static void main (String agrs[]){
		int temp[]=new int[3];
		int i=0;
		int max=0;
		for(i=0;i<3;i++){
			temp[i]=i+1;
		}
		for(int x=0;x<3;x++){
		if(temp[x]>max)
			max=temp[x];
		}
		System.out.print(max);
	}
}
