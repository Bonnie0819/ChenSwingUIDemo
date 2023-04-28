import javax.swing.*;
import java.awt.event.*;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;

    private JTextField textField1;
    private JButton button2;
    private JButton sendButton;
    private JTextPane textPane1;
    private JLabel label1;

    public MainGUIWindow() {
        createUICompents();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {}


    private void createUICompents() {
        setContentPane(mainPanel);
        setTitle("MY GUI!");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sendButton.addActionListener(this);
        button2.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);
    }
}
