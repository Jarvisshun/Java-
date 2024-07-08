package cc;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout; // ������ʽ���֣�FlowLayout��
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourMax2 {
    // ��Ա����
    JTextField tfOne;
    JTextField tfTwo;
    JTextField tfThree;
    JTextField tfFour;
    JTextField tfMax;
    JButton btMax;

    // ��ʼ������
    public void init() {
        JFrame f = new JFrame();
        f.setSize(500, 300);
        f.setTitle("�ĸ��������ֵ");

        // �������
        tfOne = new JTextField(10);
        tfTwo = new JTextField(10);
        tfThree = new JTextField(10);
        tfFour = new JTextField(10);
        tfMax = new JTextField(10);
        btMax = new JButton("�����ֵ");

        // �������
        f.setLayout(new FlowLayout()); // ������ʽ����
        f.add(tfOne);
        f.add(tfTwo);
        f.add(tfThree);
        f.add(tfFour);
        f.add(btMax);
        f.add(tfMax);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������������
        MyActLis mal = new MyActLis();
        // �¼�Դע�����
        btMax.addActionListener(mal);
    }

    public static void main(String[] args) {
        // ���� TestMax ���󲢳�ʼ������
    	FourMax2 tm = new FourMax2();
        tm.init();
    }

    // ��Ƽ������� ������
    class MyActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // 1. ȡ�ĸ��ı������
                int num1 = Integer.parseInt(tfOne.getText());
                int num2 = Integer.parseInt(tfTwo.getText());
                int num3 = Integer.parseInt(tfThree.getText());
                int num4 = Integer.parseInt(tfFour.getText());

                // 2. �Ƚ����ֵ
                int max = num1;
                if (num2 > max)
                    max = num2;
                if (num3 > max)
                    max = num3;
                if (num4 > max)
                    max = num4;
                // 3. �ı���ֵ����ʾ���ֵ
                tfMax.setText(String.valueOf(max));
            } catch (NumberFormatException ex) {
                // �����ı������ݲ������������
                tfMax.setText("����������");
            }
        }
    }
}
