package 最大值;

public class IfElse {
	public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20; 
        int num3 = 15;
        int max = num1; // 假设第一个数是最大的
        // 检查第二个数是否大于最大值
        if (num2 > max) {
            max = num2; // 如果是，则更新最大值
        }
        // 检查第三个数是否大于最大值
        if (num3 > max) {
            max = num3; // 如果是，则更新最大值
        }
        // 输出最大值
        System.out.println("三个数中最大值为: " + max);
    }
}
