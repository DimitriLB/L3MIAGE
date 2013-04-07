/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.ValiderInscription;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Menphis_Timrid
 */
public class FenetreInscription extends JFrame{
    
    
    
    public FenetreInscription(){
        build();
    }
    
    private void build() {
        setTitle("inscription");
        setSize(300,200);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPanel());
        setVisible(true);
    }
    
    public JPanel buildContentPanel(){
        JPanel panel= new JPanel();
        
        JLabel login = new JLabel();
        login.setText("Login: ");        
        JLabel mot_de_passe = new JLabel();
        mot_de_passe.setText("mot de passe: ");
        JTextField loginText = new JTextField("              ");
        JTextField passwordText = new JTextField("             ");
        JButton valider = new JButton(new ValiderInscription(this,loginText,passwordText));
        valider.setText("valider");
        panel.add(login);
        panel.add(loginText);
        panel.add(mot_de_passe);
        panel.add(passwordText);
        panel.add(valider);
        
        return panel;
    }
    
}
