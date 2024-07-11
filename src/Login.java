import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField User;
    private JPasswordField pass;
    private JButton logInButton;
    private JPanel loginPanel;

    public Login() {
        super("Inicio de Sesion");
        setContentPane(loginPanel);
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = "admin";
                String password = "admin123";
                if(User.getText().equals(username) && pass.getText().equals(password)){
                    JOptionPane.showMessageDialog(null, "Bienvenido!");
                    Biografia bio = new Biografia();
                    bio.iniciar();
                    bio.mostrarBio();
                    dispose(); //Cerrar la ventana actual
                } else {
                    JOptionPane.showMessageDialog(null, "Nombre de Usuario o Contraseña incorrectos.");
                }
            }
        });
    }

    public void iniciar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,200);
        setVisible(true);
    }
}
