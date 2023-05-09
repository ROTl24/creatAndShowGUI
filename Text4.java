package Example01;

import javax.swing.*;
import java.awt.*;

//FlowLayout(流式布局管理器)
public class Text4 {
    private static void creatAndShowGUI4(){
        JFrame f = new JFrame("FlowLayout");
        //设置窗体中的布局管理器为FlowLayout
        //所有组件左对齐，水平间距为20，垂直间距为30;
        f.setLayout((new FlowLayout(FlowLayout.LEFT,20,30)));
        f.setSize(400,200);//设置窗体大小
        f.setLocation(300,200);//设置显示位置
        //向窗体内添加组件
        f.add(new JButton("第一个按钮"));
        f.add(new JButton("第二个按钮"));
        f.add(new JButton("第三个按钮"));
        f.add(new JButton("第四个按钮"));
        f.add(new JButton("第五个按钮"));
        f.setVisible(true);//设置窗体可见
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Text4::creatAndShowGUI4);
    }
}
