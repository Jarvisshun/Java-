package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	JButton btSave,btTake,btQuery,btTrans,btModipwd,btExit;
	public void init() {
		btSave=new JButton("���");
		btTake=new JButton("ȡ��");
		btQuery=new JButton("��ѯ");
		btTrans=new JButton("ת��");
		btModipwd=new JButton("�޸�����");
		btExit=new JButton("�˳�");
		this.setLayout(new GridLayout(3,2));
		this.add(btSave);
		this.add(btTake);
		this.add(btQuery);
		this.add(btTrans);
		this.add(btModipwd);
		this.add(btExit);
		
		this.setTitle("��ӭ������Ժ���У�");
		this.setSize(600, 600);
		this.setVisible(true);
		
	}
	public static void main(String args[]) {
		new MainFrame().init();
	}
}
