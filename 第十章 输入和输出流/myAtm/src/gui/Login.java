package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	JTextField tfAccount;
	JPasswordField tfPwd;
	JButton btOk,btCancel;
	public void init() {
		JLabel lAccount=new JLabel("      ��                   ��");
		JLabel lPwd=new JLabel("      ��                    ��");
		tfAccount=new JTextField();
		tfPwd=new JPasswordField();
		btOk=new JButton("��¼");
		btCancel=new JButton("ȡ��");
		this.setLayout(new GridLayout(3,2));
		this.add(lAccount);
		this.add(tfAccount);
		this.add(lPwd);
		this.add(tfPwd);
		this.add(btOk);
		this.add(btCancel);
		
		this.setTitle("���¼��");
		this.setSize(300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Login().init();
	}
}
