import javax.swing.*;

public class JavaCalculator {

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton button1;
    private JButton a3Button;
    private JButton xButton1;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton button8;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton xButton;
    private JButton a6Button2;
    private JButton a3Button1;
    private JButton a8Button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

