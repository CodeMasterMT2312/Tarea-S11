import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia extends JFrame {
    private JTextArea biografiaArea;
    private JButton HOBBIESButton;
    private JPanel BiografiaPanel;

    public Biografia() {
        super("Biografia");
        setContentPane(BiografiaPanel);
        HOBBIESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hobbie HOB = new Hobbie();
                HOB.iniciar();
                dispose();
            }
        });
    }
    public void iniciar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850,750);
        setVisible(true);
    }
    public void mostrarBio(){
        Variables var = new Variables();
        String Show =var.Byo();
        biografiaArea.setText(Show);
    }
}
