/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.AfficheInscription;
import controleur.VerifierConnexion;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controleur.VerifierConnexion;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Menphis_Timrid
 */
public class FenetreConnexion extends JFrame{
    
    
    
    public FenetreConnexion(){
        super();
        build();
    }
    
    public void build(){
        setTitle("Identification");
        setSize(300,200);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPanel());
        setVisible(true);
    }
    
    public JPanel buildContentPanel(){
        JPanel panel= new JPanel();
        JLabel log=new JLabel("Login: ");
        JTextField login = new JTextField(6);
        panel.add(log);
        panel.add(login);
        JLabel pass=new JLabel("password: ");
        JPasswordField password = new JPasswordField(6);
        panel.add(pass);
        panel.add(password);
        JButton vérifier =new JButton(new VerifierConnexion(login,password,this));
        vérifier.setText("connexion");
        panel.add(vérifier);
        
        //panel d'inscription
        JPanel panelinscription= new JPanel();
        JLabel inscriptionLabel=new JLabel();
        inscriptionLabel.setText("Pas de compte? ");
        JButton inscipritonButton=new JButton(new AfficheInscription(this));
        inscipritonButton.setText("s'inscrire");
        panelinscription.add(inscriptionLabel);
        panelinscription.add(inscipritonButton);
        panel.add(panelinscription);
        
        
        
        return panel;
    }
}
