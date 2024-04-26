package Pp_Game_1999.Pp_v000;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test extends JFrame implements KeyListener {

    public Test() {
        addKeyListener(this);
    }

    public static void main(String[] args) throws InterruptedException {

        Test test = new Test();
        test.setSize(200,200);
        test.setVisible(true);
        test.setLayout(new GridLayout(2, 2,0,0));

        JTextArea textArea = new JTextArea("");

        int[][] mas1 = new int[][]{{1,2},{3,4}};
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                textArea.append(String.valueOf(mas1[i][j]));
            }
            textArea.append("\n");
        }
        JLabel jl = new JLabel("121");
        jl.setForeground(Color.BLUE);
        test.add(jl);
        JPanel jp = new JPanel();
        jp.setBackground(Color.blue);
        test.add(jp);
        test.setVisible(true);
        Thread.sleep(1_000);
        test.add(new JScrollPane(textArea));
        test.setVisible(true);



    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP)
            System.out.println("1");
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            System.out.println("2");
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            System.out.println("3");
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            System.out.println("4");
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
