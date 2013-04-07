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
import model.Joueur;
import model.Partie;
import vue.FenetreJeu;
import vue.FenetrePrincipale;

/**
 *
 * @author Menphis_Timrid
 */
public class LancerCampagne extends AbstractAction {

    private int niveau;
    private Joueur monJoueur;
    private int nombreQuestions;
    private FenetrePrincipale maFenetrePrincipale;
    private Partie maPartie;

    public LancerCampagne(FenetrePrincipale f, Joueur j, int n) throws SQLException, ClassNotFoundException {
        this.maFenetrePrincipale = f;
        this.niveau = n;
        this.monJoueur = j;
        this.maPartie = new Partie(this.niveau);
        //on détermine le nombre de questions: 10 pour le niveau 1 20 pour le 2 etc ... le niveau 4 étant géré différemment
        if (n < 4) {
            this.nombreQuestions = n * 10;
        } else {
            this.nombreQuestions = this.maPartie.nombreQuestionsTotal();
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //on règle le problème des jokers
        if (niveau == 1) {
            this.maPartie.setFiftyFifty(true);
            this.maPartie.setSwitcher(true);
        }
        if (niveau == 2) {
            this.maPartie.setSwitcher(true);
        }
        //il y à deux traitements possibles, le niveau 4 étant différent des autres
        if (this.maPartie.getNiveau() < 3) {
            //il faut remplir les questions, le deuxième argument est le nombre de questions à tirer 
            try {
                this.maPartie.setNbQuestions(this.nombreQuestions);
                this.maPartie.setPartieRapide(false);
                this.maPartie.remplirQuestions(this.maPartie.getNombreQuestions());
                new FenetreJeu(this.monJoueur, this.maPartie);
                this.maFenetrePrincipale.setVisible(false);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LancerCampagne.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException ex) {
                System.out.println("pas de questions pour ce niveau");
            } catch (SQLException ex) {
                Logger.getLogger(LancerCampagne.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else //niveau 4
        {
            try {
                
                this.maPartie.setNbQuestions(this.nombreQuestions);
                this.maPartie.setPartieRapide(false);
                this.maPartie.remplirQuestions();                
                new FenetreJeu(this.monJoueur, this.maPartie);
                this.maFenetrePrincipale.setVisible(false);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LancerCampagne.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException ex) {
                System.out.println("pas de questions pour ce niveau");
            } catch (SQLException ex) {
                Logger.getLogger(LancerCampagne.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }
}
