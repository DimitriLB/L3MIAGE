/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.AbstractAction;
import model.Joueur;
import model.Partie;
import model.Questions;
import vue.FenetreJeu;

/**
 *
 * @author Menphis_Timrid
 */
public class Fifty extends AbstractAction{

    
    private Partie maPartie;
    private Questions maQuestion;    
    private Joueur monJoueur;
    private FenetreJeu maFenetreJeu;
    
    public Fifty( Partie p, Questions q,Joueur j, FenetreJeu fj){
        
        this.maPartie=p;
        this.maQuestion=q;
        this.monJoueur=j;
        this.maFenetreJeu=fj;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //on doit enlever 2 mauvaises réponse
        String reponse=this.maQuestion.getReponseCorrecte();
        String[] reponses=this.maQuestion.getReponses();       
        int compteur=0;
        if(! reponse.equals(reponses[0]) && compteur<2){
            this.maQuestion.setReponse(0, "");
            compteur=compteur+1;
        }
        if(! reponse.equals(reponses[1]) && compteur<2){
            this.maQuestion.setReponse(1, "");
            compteur=compteur+1;
        }
        if(! reponse.equals(reponses[2]) && compteur<2){
            this.maQuestion.setReponse(2, "");
            compteur=compteur+1;
        }
        if(! reponse.equals(reponses[3]) && compteur<2){
            this.maQuestion.setReponse(3, "");
            compteur=compteur+1;
        }
        //une fois les 2 réponses enlevées on doit retirer le joker
        this.maPartie.setFiftyFifty(false);
        //et renvoyer le joueur vers la fenetre actualisée
        this.maFenetreJeu.maj();
            
    }
    
}
