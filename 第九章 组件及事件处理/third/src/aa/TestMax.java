package aa;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestMax{
	//��Ա����
	JTextField tfOne;
	JTextField tfTwo;
	JTextField tfThree;
	JTextField tfMax;
	JButton btMax;
	
	//��ʼ������
	public void init() {
		JFrame f=new JFrame();
		f.setSize(500,300);
		f.setTitle("�����������ֵ");
		
		//�������
		tfOne=new JTextField(10);
		tfTwo=new JTextField(20);
		tfThree=new JTextField(10);
		tfMax=new JTextField();
		btMax=new JButton("�����ֵ");
		
		//�������
		f.add(tfOne,"West");
		f.add(tfTwo,"North");
		f.add(tfThree,"East");
		f.add(btMax,"Center");
		f.add(tfMax,"South");
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������������
		MyActLis mal=new MyActLis();
		//�¼�Դע�����
		btMax.addActionListener(mal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMax tm=new TestMax();
		tm.init();
	}
	//��Ƽ�������  ������
	class MyActLis implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//1.ȡ�����ı������
			int num1=Integer.parseInt(tfOne.getText());
			int num2=Integer.parseInt(tfTwo.getText());
			int num3=Integer.parseInt(tfThree.getText());
			
			//2.�Ƚ����ֵ
			int max;
			max=num1;
			if(num2>max)
				max=num2;
			if(num3>max)
				max=num3;
			//3.�ı���ֵ����ʾ���ֵ
			tfMax.setText(max+"");
		}
	}
}
