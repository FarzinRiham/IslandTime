import javax.swing.*;
public class MainFrame {
    private GraphicsPanel panel;

    public MainFrame() {
        JFrame frame = new JFrame("Island Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600); // 540 height of image + 40 for window menu bar
        frame.setLocationRelativeTo(null); // auto-centers frame in screen

        panel = new GraphicsPanel(frame);
        frame.add(panel);

        frame.setVisible(true);
    }

    public void run() {
        panel.repaint();
    }
}
