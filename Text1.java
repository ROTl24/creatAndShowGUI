package Example01;

import javax.swing.*;

public class Text1 {
    public static void creatAndShowGUI(){
        //创建并设置一个名为JFrameTest的窗口
        JFrame frame = new JFrame("JFrameTest");
        //设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口尺寸
        frame.setSize(250,150);
        //展示JFrame窗口容器
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Text1::creatAndShowGUI);
    }
}
