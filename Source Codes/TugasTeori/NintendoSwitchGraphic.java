package TugasTeori;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class NintendoSwitchGraphic extends JPanel
{
    private static final int WIDTH = 566;
    private static final int HEIGHT = 420;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        this.setBackground(Color.WHITE);

        drawBackground(g);
        drawLeftJoycon(g);
        drawRightJoycon(g);
        drawMonitor(g);
    }

    private void drawBackground(Graphics g)
    {
        g.setColor(new Color(255, 95, 83));
        g.fillRect(0, 0, WIDTH/2, HEIGHT);
        g.setColor(new Color(0, 187, 218));
        g.fillRect(WIDTH/2, 0, WIDTH/2, HEIGHT);
    }

    private void drawLeftJoycon(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        g.setColor(new Color(26, 26, 26));
        gg.setStroke(new BasicStroke(4f));
        gg.drawArc(42, 48, 86, 60, 90, 85);

        g.setColor(new Color(0, 187, 218));
        g.fillRoundRect(40, 50, 100, 200, 80, 75);
        g.setColor(new Color(26, 26, 26));
        g.fillOval(53, 85, 34, 34);
        g.fillOval(63, 140, 14, 14);
        g.fillOval(63, 174, 14, 14);
        g.fillOval(46, 157, 14, 14);
        g.fillOval(80, 157, 14, 14);
        g.fillRect(85, 70, 10, 4);
        g.fillRoundRect(76, 195, 12, 12, 2, 2);
    }

    private void drawRightJoycon(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        g.setColor(new Color(26, 26, 26));
        gg.setStroke(new BasicStroke(4f));
        gg.drawArc(422, 48, 86, 60, 90, -85);

        g.setColor(new Color(255, 95, 83));
        g.fillRoundRect(410, 50, 100, 200, 80, 75);
        g.setColor(new Color(26, 26, 26));
        g.fillOval(473, 78, 14, 14);
        g.fillOval(473, 112, 14, 14);
        g.fillOval(456, 95, 14, 14);
        g.fillOval(490, 95, 14, 14);
        g.fillOval(463, 147, 34, 34);
        g.fillRect(455, 70, 10, 4);
        g.fillRect(458, 67, 4, 10);
        g.fillOval(462, 195, 14, 14);
    }

    private void drawMonitor(Graphics g)
    {
        g.setColor(new Color(64, 64, 64));
        g.fillRect(100, 50, 350, 200);

        g.setColor(new Color(13, 13, 13));
        g.fillRoundRect(110, 60, 330, 180, 10, 10);

        g.setColor(new Color(32, 32, 36));
        g.fillRect(130, 75, 290, 150);

        drawGlare(g);
    }

    public void drawGlare(Graphics g)
    {
        g.setColor(new Color(38, 39, 43));
        int[] x = {250, 330, 250, 170};
        int[] y = {75, 75, 225, 225};
        g.fillPolygon(x, y, 4);

        x = new int[]{350, 380, 300, 270};
        g.fillPolygon(x, y, 4);
    }

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("A Nintendo Switch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NintendoSwitchGraphic nintendoSwitch = new NintendoSwitchGraphic();
        frame.add(nintendoSwitch);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
