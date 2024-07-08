package cc;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout; // 导入流式布局（FlowLayout）
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourMax2 {
    // 成员变量
    JTextField tfOne;
    JTextField tfTwo;
    JTextField tfThree;
    JTextField tfFour;
    JTextField tfMax;
    JButton btMax;

    // 初始化界面
    public void init() {
        JFrame f = new JFrame();
        f.setSize(500, 300);
        f.setTitle("四个数求最大值");

        // 创建组件
        tfOne = new JTextField(10);
        tfTwo = new JTextField(10);
        tfThree = new JTextField(10);
        tfFour = new JTextField(10);
        tfMax = new JTextField(10);
        btMax = new JButton("求最大值");

        // 放置组件
        f.setLayout(new FlowLayout()); // 设置流式布局
        f.add(tfOne);
        f.add(tfTwo);
        f.add(tfThree);
        f.add(tfFour);
        f.add(btMax);
        f.add(tfMax);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 定义监听类对象
        MyActLis mal = new MyActLis();
        // 事件源注册监听
        btMax.addActionListener(mal);
    }

    public static void main(String[] args) {
        // 创建 TestMax 对象并初始化界面
    	FourMax2 tm = new FourMax2();
        tm.init();
    }

    // 设计监听器类 内置类
    class MyActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // 1. 取四个文本框的数
                int num1 = Integer.parseInt(tfOne.getText());
                int num2 = Integer.parseInt(tfTwo.getText());
                int num3 = Integer.parseInt(tfThree.getText());
                int num4 = Integer.parseInt(tfFour.getText());

                // 2. 比较最大值
                int max = num1;
                if (num2 > max)
                    max = num2;
                if (num3 > max)
                    max = num3;
                if (num4 > max)
                    max = num4;
                // 3. 文本框赋值，显示最大值
                tfMax.setText(String.valueOf(max));
            } catch (NumberFormatException ex) {
                // 处理文本框内容不是整数的情况
                tfMax.setText("请输入整数");
            }
        }
    }
}
