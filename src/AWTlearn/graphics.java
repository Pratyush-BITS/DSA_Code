package AWTlearn;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class graphics extends JPanel {

    private Point lastPoint;

    public graphics() {
        setBackground(Color.BLACK);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastPoint = new Point(e.getX(), e.getY());
                Graphics g = getGraphics();
                int x = lastPoint.x;
                int y = lastPoint.y;
                g.setColor(Color.WHITE);
                for(int i = 0;i<4;i++)
                        drawing(g,x,y+i*150,i);
                g.dispose();

            }
        });

    }


    private static void drawing(Graphics g,int x,int y,int i){
        for(int j = 0;j<=i;j++) {
            g.drawLine(x, y, x -= 35, y -= 120);
            g.drawLine(x, y, x -= 35, y += 120);
            g.drawLine(x, y, x += 100, y -= 70);
            g.drawLine(x, y, x -= 130, y);
            g.drawLine(x, y, x += 100, y += 70);
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Graphics Learning");
        frame.getContentPane().add(new graphics(),BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
