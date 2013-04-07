/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import Dao.DBManager;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Joueur;
import vue.FenetreConnexion;
import vue.FenetreInscription;

/**
 *
 * @author Menphis_Timrid
 */
public class ValiderInscription extends AbstractAction {

    private Connection maConnexion;
    private JTextField login;
    private JTextField password;
    private FenetreInscription maFenetre;

    public ValiderInscription(FenetreInscription f, JTextField l, JTextField p) {
        
        this.login = l;
        this.password = p;
        this.maFenetre = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String loginT = this.login.getText();
        String passwordT = this.password.getText();
        //on va vérifier si le password est déjà pris ou non
        try {           
                Joueur j = new Joueur(loginT,passwordT);
           //s'il n'est pas pris on l'insère dans la BDD
            if (j.existe(loginT, passwordT)==false) {                
                boolean resultat = j.insertJoueur(loginT, passwordT);
                //si l'insertion s'est déroulée correctement on le renvoie à la fenetre de connexion
                if (resultat) {                    
                    this.maFenetre.setVisible(false);
                    new FenetreConnexion();
                }
            } else {
                JOptionPane.showMessageDialog(null, "impossible, " + loginT + " est déjà pris");
            }


        } catch (SQLException ex) {
            Logger.getLogger(ValiderInscription.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(ValiderInscription.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
