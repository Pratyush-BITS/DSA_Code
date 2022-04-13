package AWTlearn;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class guiprogram {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        jFrame.setContentPane(new Container());
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
    }
}
