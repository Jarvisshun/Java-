package aa;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestMax{
	//成员变量
	JTextField tfOne;
	JTextField tfTwo;
	JTextField tfThree;
	JTextField tfMax;
	JButton btMax;
	
	//初始化界面
	public void init() {
		JFrame f=new JFrame();
		f.setSize(500,300);
		f.setTitle("三个数求最大值");
		
		//创建组件
		tfOne=new JTextField(10);
		tfTwo=new JTextField(20);
		tfThree=new JTextField(10);
		tfMax=new JTextField();
		btMax=new JButton("求最大值");
		
		//放置组件
		f.add(tfOne,"West");
		f.add(tfTwo,"North");
		f.add(tfThree,"East");
		f.add(btMax,"Center");
		f.add(tfMax,"South");
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//定义监听类对象
		MyActLis mal=new MyActLis();
		//事件源注册监听
		btMax.addActionListener(mal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMax tm=new TestMax();
		tm.init();
	}
	//设计监听器类  内置类
	class MyActLis implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//1.取三个文本框的数
			int num1=Integer.parseInt(tfOne.getText());
			int num2=Integer.parseInt(tfTwo.getText());
			int num3=Integer.parseInt(tfThree.getText());
			
			//2.比较最大值
			int max;
			max=num1;
			if(num2>max)
				max=num2;
			if(num3>max)
				max=num3;
			//3.文本框赋值，显示最大值
			tfMax.setText(max+"");
		}
	}
}
