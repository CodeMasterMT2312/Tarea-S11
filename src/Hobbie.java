import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbie extends JFrame {
    private JButton regresarButton;
    private JPanel HobbiePanel;

    public Hobbie() {
        super("HOBBIES");
        setContentPane(HobbiePanel);
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biografia BIO1 = new Biografia();
                BIO1.iniciar();
                BIO1.mostrarBio();
                dispose(); // Cierra la ventana actual y abre la Biografia
            }
        });
    }
    public void iniciar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,700);
        setVisible(true);
    }
}
