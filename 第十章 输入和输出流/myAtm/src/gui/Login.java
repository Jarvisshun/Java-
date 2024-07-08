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
		JLabel lAccount=new JLabel("      ÕË                   ºÅ");
		JLabel lPwd=new JLabel("      ÃÜ                    Âë");
		tfAccount=new JTextField();
		tfPwd=new JPasswordField();
		btOk=new JButton("µÇÂ¼");
		btCancel=new JButton("È¡Ïû");
		this.setLayout(new GridLayout(3,2));
		this.add(lAccount);
		this.add(tfAccount);
		this.add(lPwd);
		this.add(tfPwd);
		this.add(btOk);
		this.add(btCancel);
		
		this.setTitle("ÇëµÇÂ¼£º");
		this.setSize(300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Login().init();
	}
}
