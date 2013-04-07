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
import model.Questions;
import vue.FenetreJeu;

/**
 *
 * @author Menphis_Timrid
 */
public class Switcher extends AbstractAction {

    private Partie maPartie;
    private Questions maQuestion;
    private FenetreJeu maFenetreJeu;

    public Switcher(Partie p, Questions q, FenetreJeu fj) {
        this.maPartie = p;
        this.maQuestion = q;
        this.maFenetreJeu = fj;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //On va tirer une question d'un niveau correspondant à la partie
            this.maPartie.ajouterUneQuestion();
            //puis on supprime la question que l'utilisateur ne veut plus
            this.maPartie.getMesQuestions().remove(this.maQuestion);
            //le joueur à utiliser son joker, il faut donc lui enlever
            this.maPartie.setSwitcher(false);
            //puis renvoyer le joueur vers sa nouvelle question
            this.maFenetreJeu.maj();
        } catch (SQLException ex) {
            Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
