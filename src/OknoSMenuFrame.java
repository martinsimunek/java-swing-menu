import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class OknoSMenuFrame extends JFrame {
    private JButton button1;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuAkce = new JMenu("Akce", true);
    private JMenuItem miPozdrav = new JMenuItem("Pozdrav!", KeyEvent.VK_P);
    public OknoSMenuFrame() {
        //button1 = new JButton("Click me!");
        //add(button1);
        initMenu();
        setTitle("Okno s menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void initMenu() {
        miPozdrav.addActionListener(e -> provedPozdrav());
        miPozdrav.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        menuAkce.add(miPozdrav);
        menuAkce.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menuAkce);

        setJMenuBar(menuBar);  // Přiřazení panelu s menu k oknu.
    }
    private void provedPozdrav() {
        JOptionPane.showMessageDialog(this, "Ahoj!");
    }
}
