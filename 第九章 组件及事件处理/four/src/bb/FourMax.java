package bb;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourMax {
	//��Ա����
    JTextField tfOne;
    JTextField tfTwo;
    JTextField tfThree;
    JTextField tfFour;
    JTextField tfMax;
    JButton btMax;

    //��ʼ������
    public void init() {
        JFrame f = new JFrame();
        f.setSize(500, 300);
        f.setTitle("�ĸ��������ֵ");

        // ������壬������GridLayout���ֹ�����
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3��2�У����Ϊ5����

        // �������
        tfOne = new JTextField(10);
        tfTwo = new JTextField(10);
        tfThree = new JTextField(10);
        tfFour = new JTextField(10);
        tfMax = new JTextField(10);
        btMax = new JButton("�����ֵ");

        // �������������
        panel.add(new JLabel("��ֵ1:"));
        panel.add(tfOne);
        panel.add(new JLabel("��ֵ2:"));
        panel.add(tfTwo);
        panel.add(new JLabel("��ֵ3:"));
        panel.add(tfThree);
        panel.add(new JLabel("��ֵ4:"));
        panel.add(tfFour);
        panel.add(btMax);
        panel.add(tfMax);

        // �������ӵ�������
        f.add(panel);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������������
        MyActLis mal = new MyActLis();
        // �¼�Դע�����
        btMax.addActionListener(mal);
    }

    public static void main(String[] args) {
        // ���� TestMax ���󲢳�ʼ������
        FourMax tm = new FourMax();
        tm.init();
    }

    // ��Ƽ������� ������
    class MyActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                //1.ȡ�ĸ��ı������
                int num1 = Integer.parseInt(tfOne.getText());
                int num2 = Integer.parseInt(tfTwo.getText());
                int num3 = Integer.parseInt(tfThree.getText());
                int num4 = Integer.parseInt(tfFour.getText());

                //2.�Ƚ����ֵ
                int max = num1;
                if (num2 > max)
                    max = num2;
                if (num3 > max)
                    max = num3;
                if (num4 > max)
                    max = num4;
                //3.�ı���ֵ����ʾ���ֵ
                tfMax.setText(String.valueOf(max));
            } catch (NumberFormatException ex) {
                // �����ı������ݲ������������
                tfMax.setText("����������");
            }
        }
    }
}
