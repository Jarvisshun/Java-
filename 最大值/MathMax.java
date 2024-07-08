package 最大值;

public class MathMax {
	
	    public static void main(String[] args) {
	        // 1. 直接比较法
	        int a = 5, b = 10, c = 3;
	        int max = Max(a, b, c);
	        System.out.println("三个数中最大值为：" + max);
	    }
	    public static int Max(int a, int b, int c) {
	        // 直接使用Math.max方法比较三个数的大小，得到最大值
	        return Math.max(Math.max(a, b), c);
	    }
	

}
