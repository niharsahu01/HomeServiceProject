import javax.swing.*;
import java.awt.*;

class HanumanJiFrame extends JFrame {

    public HanumanJiFrame() {
        setTitle("Hanuman Ji");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a custom JPanel for drawing Hanuman Ji
        JPanel hanumanPanel = new HanumanJiPanel();
        add(hanumanPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HanumanJiFrame::new);
    }
}