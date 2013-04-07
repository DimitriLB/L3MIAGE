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
import model.Joueur;

/**
 *
 * @author Menphis_Timrid
 */
public class Sauvegarde extends AbstractAction {

    private Joueur monJoueur;

    public Sauvegarde(Joueur j) {
        this.monJoueur = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //System.out.println("niveau du joueur de la sauvegarde="+this.monJoueur.getNiveau());
            if (this.monJoueur.save(this.monJoueur)) {
                JOptionPane.showMessageDialog(null, "Sauvegarde effectuée avec succès");
            } else {
                JOptionPane.showMessageDialog(null, "Echec de la sauvegarde");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
