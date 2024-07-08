package aa;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class TestMax{
	//成员变量
	JTextField tfOne;
	JTextField tfTwo;
	JTextField tfThree;
	JTextField tfFour;
	
	JTextField tfMax;
	JButton btMax;
	
	//初始化界面
	public void init() {
		JFrame f=new JFrame();
		f.setSize(400,300);
		f.setTitle("四个数求最大值");
		
		//创建组件
		tfOne=new JTextField(10);
		tfTwo=new JTextField(10);
		tfThree=new JTextField(10);
		tfFour=new JTextField(10);
		tfMax=new JTextField(10);
		btMax=new JButton("求最大值");
		//标签对象
		JLabel lOne=new JLabel("第一个数：");
		JLabel lTwo=new JLabel("第二个数：");
		JLabel lThree=new JLabel("第三个数：");
		JLabel lFour=new JLabel("第四个数：");
		JLabel lMax=new JLabel("最大值：");
		//设置流式布局
		FlowLayout fl=new FlowLayout();
		f.setLayout(fl);
		//放置组件
		f.add(lOne);
		f.add(tfOne);
		f.add(lTwo);		
		f.add(tfTwo);
		f.add(lThree);
		f.add(tfThree);
		f.add(lFour);
		f.add(tfFour);
		f.add(lMax);
		f.add(tfMax);
		f.add(btMax);
		
		
		f.setResizable(false);
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
			//1.取四个文本框的数
			int num1=Integer.parseInt(tfOne.getText());
			int num2=Integer.parseInt(tfTwo.getText());
			int num3=Integer.parseInt(tfThree.getText());
			int num4=Integer.parseInt(tfFour.getText());
			
			//2.比较最大值
			int max;
			max=num1;
			if(num2>max)
				max=num2;
			if(num3>max)
				max=num3;
			if(num4>max)
				max=num4;
			//3.文本框赋值，显示最大值
			tfMax.setText(max+"");
		}
	}
}

