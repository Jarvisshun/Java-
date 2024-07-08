package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	JButton btSave,btTake,btQuery,btTrans,btModipwd,btExit;
	public void init() {
		btSave=new JButton("存款");
		btTake=new JButton("取款");
		btQuery=new JButton("查询");
		btTrans=new JButton("转账");
		btModipwd=new JButton("修改密码");
		btExit=new JButton("退出");
		this.setLayout(new GridLayout(3,2));
		this.add(btSave);
		this.add(btTake);
		this.add(btQuery);
		this.add(btTrans);
		this.add(btModipwd);
		this.add(btExit);
		
		this.setTitle("欢迎来到金院银行！");
		this.setSize(600, 600);
		this.setVisible(true);
		
	}
	public static void main(String args[]) {
		new MainFrame().init();
	}
}
