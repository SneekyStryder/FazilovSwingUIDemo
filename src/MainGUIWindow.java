import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUIWindow extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTextArea pressTheButtonTextArea;
    private JTextArea textArea1;
    private JButton pressMeButton;

    public MainGUIWindow() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Test GUI");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pressMeButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea1.append("Congratulations!");
    }
}
