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
import model.Partie;
import vue.FenetreJeu;
import vue.FenetrePrincipale;

/**
 *
 * @author Menphis_Timrid
 */
public class PartieRapide extends AbstractAction {

    private FenetrePrincipale maFenetrePrincipale;
    private Joueur monJoueur;

    public PartieRapide(FenetrePrincipale f, Joueur j) {
        this.maFenetrePrincipale = f;

        this.monJoueur = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //on créer une partie
        Partie p;
        try {
            p = new Partie();
            p.setNbQuestions(10);
            p.setPartieRapide(true);
            p.remplirQuestions();
            new FenetreJeu(this.monJoueur, p);
            this.maFenetrePrincipale.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartieRapide.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PartieRapide.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
