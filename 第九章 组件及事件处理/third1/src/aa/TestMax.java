package aa;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class TestMax{
	//��Ա����
	JTextField tfOne;
	JTextField tfTwo;
	JTextField tfThree;
	JTextField tfFour;
	
	JTextField tfMax;
	JButton btMax;
	
	//��ʼ������
	public void init() {
		JFrame f=new JFrame();
		f.setSize(400,300);
		f.setTitle("�ĸ��������ֵ");
		
		//�������
		tfOne=new JTextField(10);
		tfTwo=new JTextField(10);
		tfThree=new JTextField(10);
		tfFour=new JTextField(10);
		tfMax=new JTextField(10);
		btMax=new JButton("�����ֵ");
		//��ǩ����
		JLabel lOne=new JLabel("��һ������");
		JLabel lTwo=new JLabel("�ڶ�������");
		JLabel lThree=new JLabel("����������");
		JLabel lFour=new JLabel("���ĸ�����");
		JLabel lMax=new JLabel("���ֵ��");
		//������ʽ����
		FlowLayout fl=new FlowLayout();
		f.setLayout(fl);
		//�������
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
			//1.ȡ�ĸ��ı������
			int num1=Integer.parseInt(tfOne.getText());
			int num2=Integer.parseInt(tfTwo.getText());
			int num3=Integer.parseInt(tfThree.getText());
			int num4=Integer.parseInt(tfFour.getText());
			
			//2.�Ƚ����ֵ
			int max;
			max=num1;
			if(num2>max)
				max=num2;
			if(num3>max)
				max=num3;
			if(num4>max)
				max=num4;
			//3.�ı���ֵ����ʾ���ֵ
			tfMax.setText(max+"");
		}
	}
}

