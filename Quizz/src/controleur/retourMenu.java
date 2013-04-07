/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import model.Joueur;
import vue.FenetrePrincipale;
import vue.FenetreRecapitulative;

/**
 *
 * @author Menphis_Timrid
 */
public class retourMenu extends AbstractAction {

    private Joueur monJoueur;
    private FenetreRecapitulative maFenetre;

    public retourMenu(FenetreRecapitulative f, Joueur j) {

        this.monJoueur = j;
        this.maFenetre = f;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new FenetrePrincipale(this.monJoueur);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(retourMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(retourMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.maFenetre.setVisible(false);
    }
}
