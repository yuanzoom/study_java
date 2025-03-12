package study.d2025_2_28;

import javax.swing.*;
import java.awt.*;

public class loginJFrame extends JFrame {
    public loginJFrame(){
        //设置图标
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("image\\logo.jpg"));

        //设置界面
        initJFrame();

        //添加组件
        initView();

        //界面显示出来
        this.setVisible(true);
    }

    //添加组件
    public void initView(){
        JLabel image=new JLabel(new ImageIcon("image\\kit.jpg"));
        image.setBounds(100,50,174,174);
        this.getContentPane().add(image);
        JButton go=new JButton("go");
        go.setFont(new Font(null,1,20));
        go.setBounds(120,274,150,50);
        go.setBackground(Color.WHITE);

        this.getContentPane().add(go);
    }

    //设置界面
    public void initJFrame(){
        //设置标题
        this.setTitle("随机点名器");
        //设置大小
        this.setSize(400,500);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法进行调节
        this.setResizable(false);
        //页面居中
        this.setLocationRelativeTo(null);


        this.setAlwaysOnTop(true);
    }
}
