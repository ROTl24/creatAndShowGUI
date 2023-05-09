package Example01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//MouseEvent来监听鼠标事件
public class Text7 {
    private static void creatAndShowGUI7(){
        JFrame f = new JFrame("MouseEvent");
        f.setLayout(new FlowLayout());//为窗口设置布局
        f.setSize(300,200);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but = new JButton("按钮");
        f.add(but);
        but.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked--鼠标完成点击事件");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed--鼠标按下事件");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased--鼠标放开事件");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered--鼠标进入按钮区域事件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited--鼠标移出按钮区域事件");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Text7::creatAndShowGUI7);
    }
}
