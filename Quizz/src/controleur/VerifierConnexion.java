/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import Dao.DBManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Joueur;
import vue.FenetreConnexion;
import vue.FenetrePrincipale;

/**
 *
 * @author Menphis_Timrid
 */
public class VerifierConnexion extends AbstractAction {

    private JTextField login;
    private JTextField password;
    private FenetreConnexion maFenetre;

    public VerifierConnexion(JTextField l, JPasswordField mdp, FenetreConnexion f) {
        this.login = l;
        this.password = mdp;
        this.maFenetre = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String loginJoueur = this.login.getText();
        String passwordJoeur = this.password.getText();
        //on créer une instance de joueur pour vérifier s'il existe
        try {
            
            boolean acces;
            try {
                Joueur j = new Joueur(loginJoueur, passwordJoeur);
                acces = j.existe(loginJoueur, passwordJoeur);

                //System.out.println(acces);
                if (acces) {
                    //on récupère les données du  joueur
                    j=j.RemplirJoueur(loginJoueur, passwordJoeur);
                    this.maFenetre.setVisible(false);
                    new FenetrePrincipale(j);
                } else {
                    System.out.println("acces denied");
                    this.login.setBackground(Color.RED);
                    this.password.setBackground(Color.RED);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VerifierConnexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VerifierConnexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }

    }
}
