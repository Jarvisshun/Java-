package test;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZhxCacu extends JFrame{
	

    JButton btNum[]; // 数字按钮数组
    JButton btOper[]; // 操作符按钮数组
    JButton btPoint, btEqual; // 小数点按钮和等号按钮
    JButton btClear,btBackspace;// 清空和退格按钮
    JTextField tfResult; // 结果文本框
    double num1, num2; // 存储操作数
    String oper; // 存储操作符

    
    
    // 初始化方法
    public void init() {
        // 界面设计
        // 创建菜单栏
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("文件");
        JMenu menuEdit = new JMenu("编辑");
        JMenu menuHelp = new JMenu("帮助");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("保存(Save)");
        
        JMenuItem itemdelete=new JMenuItem("delete");
        JMenuItem itemUndoTyping=new JMenuItem("Undo Typing");
        
        JMenuItem itemAboutCalculator=new JMenuItem("About Calculator");
        JMenuItem itemWelcome=new JMenuItem("Welcome");
        
        // 将菜单添加到菜单栏
        this.setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuEdit.add(itemdelete);
        menuEdit.add(itemUndoTyping);
        menuHelp.add(itemAboutCalculator);
        menuHelp.add(itemWelcome);
        
        // 设置字体
        Font font = new Font("Serif", Font.BOLD, 50);
        
        // 创建结果文本框
        tfResult = new JTextField();
        tfResult.setEditable(false);// 禁止编辑
        
        tfResult.setHorizontalAlignment(JTextField.RIGHT);// 文本框右对齐
        tfResult.setFont(font);// 设置文本框字体
        
        tfResult.setFocusable(false);// 禁止焦点
        
        tfResult.setComponentPopupMenu(new JPopupMenu());// 禁止右键菜单
        
        // 创建数字按钮
        btNum = new JButton[10];
        for(int i = 0; i <= 9; i++) {
            btNum[i] = new JButton(i + "");
            btNum[i].setFont(font);
        }

        // 创建操作符按钮
        btOper = new JButton[4];
        for (int i = 0; i < 4; i++) {
            btOper[i] = new JButton(getOperatorString(i));
            btOper[i].setFont(font); // 设置操作符按钮字体大小
        }
        

        // 创建小数点按钮
        btPoint = new JButton(".");
        btPoint.setFont(font); // 设置小数点按钮字体大小
        
        // 创建等号按钮
        btEqual = new JButton("=");
        btEqual.setFont(font); // 设置等号按钮字体大小
        
        // 创建清空和退格按钮
        btClear = new JButton("C");
        btBackspace = new JButton("⌫");

        // 设置布局
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(5, 4, 20, 20); // 设置网格布局
        panel.setLayout(gl);

        // 添加按钮到面板上
        for (int i = 0; i < btOper.length; i++) {
            panel.add(btOper[i]);
        }
        panel.add(btClear);// 清空和退格按钮
        panel.add(btBackspace); // 退格按钮
        panel.add(new JLabel());// 占位，空白
        panel.add(new JLabel()); // 占位，空白
        
        panel.add(btNum[1]);
        panel.add(btNum[2]);
        panel.add(btNum[3]);
        panel.add(btOper[0]);
        
        panel.add(btNum[4]);
        panel.add(btNum[5]);
        panel.add(btNum[6]);
        panel.add(btOper[1]);
        
        panel.add(btNum[7]);
        panel.add(btNum[8]);
        panel.add(btNum[9]);
        panel.add(btOper[2]);
        
        panel.add(btNum[0]);
        panel.add(btPoint);
        panel.add(btEqual);
        panel.add(btOper[3]);
        
        // 在窗体上放置组件
        this.add(panel);
        this.add(tfResult, "North");
        this.add(panel, "Center");

        // 设置Windows风格
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 设置标题
        this.setTitle("40张顺23信安二班");
        // 设置窗体大小
        this.setSize(400, 600);// 固定尺寸
        this.setResizable(false);// 禁止手动拖拉边框改变大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体居中显示
        // 设置窗体可见
        this.setVisible(true);
        
        

        // 注册监听器
        MyActLis mal = new MyActLis();
        for(int i = 0; i <= 9; i++)
            btNum[i].addActionListener(mal);
        for(int i = 0; i < btOper.length; i++)
            btOper[i].addActionListener(mal);
        btEqual.addActionListener(mal);
        btPoint.addActionListener(mal);
        btClear.addActionListener(mal);// 清空按钮监听器
        btBackspace.addActionListener(mal);// 退格按钮监听器

    
        //为菜单项添加监听器
        itemAboutCalculator.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
    		//显示开发者信息对话框
    		JOptionPane.showMessageDialog(null,"姓名：张顺\n专业：信息安全\n年级：大一","关于计算器",JOptionPane.INFORMATION_MESSAGE);
    	}
    });
}
 // 获取操作符字符串
    private String getOperatorString(int index) {
        String[] operators = {"+", "-", "*", "/"};
        return operators[index];
    }
	// 主方法，程序入口
    public static void main(String[] args) {
        ZhxCacu zc = new ZhxCacu();
        zc.init();
    }

 // 监听器类设计
    class MyActLis implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = e.getActionCommand(); // 获取按钮上的文本
            // 判断按钮事件
            if(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals("0")) {
                tfResult.setText(tfResult.getText() + str); // 追加文本框内容
            } else if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                if (!tfResult.getText().isEmpty()) { // 检查文本框是否为空
                    num1 = Double.parseDouble(tfResult.getText()); // 获取第一个操作数
                    oper = str; // 获取操作符
                    tfResult.setText(""); // 清空文本框
                }
            } else if(str.equals("=")) {
                if (!tfResult.getText().isEmpty()) { // 检查文本框是否为空
                    num2 = Double.parseDouble(tfResult.getText()); // 获取第二个操作数
                    // 根据操作符计算结果
                    if(oper.equals("+")) {
                        tfResult.setText(num1 + num2 + "");
                    } else if(oper.equals("-")) {
                        tfResult.setText(num1 - num2 + "");
                    } else if(oper.equals("*")) {
                        tfResult.setText(num1 * num2 + "");
                    } else if(oper.equals("/")) {
                    	try{
                    	if(num2==0){
                            throw new ArithmeticException("除数不能为0");
                        }
                            tfResult.setText(num1 / num2 + "");                                                             		
                    }catch (ArithmeticException ex){
                        tfResult.setText(ex.getMessage());
                    	}
                    }
                }
            } else if(str.equals(".")) {
                if (!tfResult.getText().contains(".")) { // 检查文本框是否已经包含小数点
                    tfResult.setText(tfResult.getText() + "."); // 追加小数点到文本框
                }
            } else if(str.equals("C")) { // 清空按钮事件
                tfResult.setText(""); // 清空文本框内容
            } else if(str.equals("⌫")) { // 退格按钮事件
                String text = tfResult.getText();
                if (!text.isEmpty()) {
                    tfResult.setText(text.substring(0, text.length() - 1)); // 删除最后一个字符
                }
            }
        }
    }
}