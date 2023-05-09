package Example01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//KeyEvent键盘事件
public class Text8 {
    private static void creatAndShowGUI8(){
        JFrame f = new JFrame("KeyEvent");
        f.setLayout(new FlowLayout());
        f.setSize(400,300);
        f.setLocation(400,300);
        f.setVisible(true);
        JTextField tf = new JTextField(30);//创建文本框对象
        f.add(tf);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取对应的键盘字符
                char keyChar = e.getKeyChar();
                //获取对应的键盘字符代码
                int keyCode = e.getKeyCode();
                System.out.println("键盘按下的字符内容为："+keyChar+" ");
                System.out.println("键盘按下的字符代码是"+keyCode);
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Text8::creatAndShowGUI8);
    }
}
