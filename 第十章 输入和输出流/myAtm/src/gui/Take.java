package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Take extends JFrame implements ActionListener{
	JTextField tfMoney;
	private JButton bt100;
	private JButton bt200;
	private JButton bt300;
	private JButton bt500;
	private JButton bt1000;
	private JButton bt001;
	private JButton bt002;
	private JButton bt003;
	private JButton bt004;
	private JButton bt005;
	private JButton bt006;
	private JButton bt007;
	private JButton bt008;
	private JButton bt009;
	private JButton bt000;
	private JButton btOk;
	private JButton btRetry;
	private JButton btCancel;
	
	public void init(){
		//添加取款页面卡片
				JPanel panelTake = new JPanel(null);
				panelTake.setBackground(new Color(119,119,253));
				JLabel lblqukuan = new JLabel("请输入您的取款数：");
				panelTake.add(lblqukuan);
				lblqukuan.setBounds(115, 20, 150, 30);
				
				lblqukuan=new JLabel("提示：只能是100元或100元的整数倍。");
				panelTake.add(lblqukuan);
				lblqukuan.setBounds(115, 50, 300, 30);
				
				tfMoney=new JTextField(12);
				tfMoney.setEnabled(false);
				panelTake.add(tfMoney);
				tfMoney.setBounds(115,90,200,30);
				
				bt100=new JButton("100");
				panelTake.add(bt100);
				bt100.addActionListener(this);
				bt100.setBounds(45,190,60,30);
				
				bt200=new JButton("200");
				panelTake.add(bt200);
				bt200.addActionListener(this);
				bt200.setBounds(115,190,60,30);
				
				bt300=new JButton("300");
				panelTake.add(bt300);
				bt300.addActionListener(this);
				bt300.setBounds(185,190,60,30);
				
				bt500=new JButton("500");
				panelTake.add(bt500);
				bt500.addActionListener(this);
				bt500.setBounds(255,190,60,30);
				
				bt1000=new JButton("1000");
				panelTake.add(bt1000);
				bt1000.addActionListener(this);
				bt1000.setBounds(325,190,65,30);
				
				bt001=new JButton("1");
				panelTake.add(bt001);
				bt001.addActionListener(this);
				bt001.setBounds(45,230,60,30);
				
				bt002=new JButton("2");
				panelTake.add(bt002);
				bt002.addActionListener(this);
				bt002.setBounds(115,230,60,30);
				
				bt003=new JButton("3");
				panelTake.add(bt003);
				bt003.addActionListener(this);
				bt003.setBounds(185,230,60,30);
				
				bt004=new JButton("4");
				panelTake.add(bt004);
				bt004.addActionListener(this);
				bt004.setBounds(255,230,60,30);
				
				bt005=new JButton("5");
				panelTake.add(bt005);
				bt005.addActionListener(this);
				bt005.setBounds(325,230,65,30);
				
				bt006=new JButton("6");
				panelTake.add(bt006);
				bt006.addActionListener(this);
				bt006.setBounds(45,270,60,30);
				
				bt007=new JButton("7");
				panelTake.add(bt007);
				bt007.addActionListener(this);
				bt007.setBounds(115,270,60,30);
				
				bt008=new JButton("8");
				panelTake.add(bt008);
				bt008.addActionListener(this);
				bt008.setBounds(185,270,60,30);
				
				bt009=new JButton("9");
				panelTake.add(bt009);
				bt009.addActionListener(this);
				bt009.setBounds(255,270,60,30);
				
				bt000=new JButton("0");
				panelTake.add(bt000);
				bt000.addActionListener(this);
				bt000.setBounds(325,270,65,30);
				
				btOk=new JButton("确定");
				panelTake.add(btOk);
				btOk.addActionListener(this);
				btOk.setBounds(70,140,80,30);
				
				btRetry=new JButton("重输");
				panelTake.add(btRetry);
				btRetry.addActionListener(this);
				btRetry.setBounds(175,140,80,30);
				
				btCancel=new JButton("返回");
				panelTake.add(btCancel);
				btCancel.addActionListener(this);
				btCancel.setBounds(280,140,80,30);
				
				this.setTitle("取款！");
				this.add(panelTake);
				this.setSize(435,350);
				this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt100||arg0.getSource()==bt200||arg0.getSource()==bt300||arg0.getSource()==bt500||arg0.getSource()==bt1000)
			tfMoney.setText(arg0.getActionCommand());
		else if(arg0.getSource()==bt000||arg0.getSource()==bt001||arg0.getSource()==bt002||arg0.getSource()==bt003||arg0.getSource()==bt004||arg0.getSource()==bt005||arg0.getSource()==bt006||arg0.getSource()==bt007||arg0.getSource()==bt008||arg0.getSource()==bt009){
			tfMoney.setText(tfMoney.getText()+arg0.getActionCommand());
		}else if(arg0.getSource()==btOk){
			int money=Integer.parseInt(tfMoney.getText());
			JOptionPane.showMessageDialog(null, "恭喜你成功取款"+money+"元\n当前账户余额为："+money);
			tfMoney.setText("");
			}
		}
}
