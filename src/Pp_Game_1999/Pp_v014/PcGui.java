package Pp_Game_1999.Pp_v014;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class PcGui extends JFrame implements KeyListener {
    private PcGui() {
        addKeyListener(this);
    }

    static PcGui gui = new PcGui();

    public static void main(String[] args) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            PcMotion.motion("w");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            PcMotion.motion("s");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            PcMotion.motion("a");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            PcMotion.motion("d");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}