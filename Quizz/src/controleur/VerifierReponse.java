/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Joueur;
import model.Partie;
import model.Questions;
import vue.FenetreJeu;
import vue.FenetreRecapitulative;
import vue.ZoneJeu;

/**
 *
 * @author Menphis_Timrid
 */
public class VerifierReponse extends AbstractAction{

    
    private Partie maPartie;
    private Questions maQuestion;
    private Joueur monJoueur;
    private FenetreJeu maFenetreJeu;
    private JRadioButton monRadio1;
    private JRadioButton monRadio2;
    private JRadioButton monRadio3;
    private JRadioButton monRadio4;
    
    public VerifierReponse(FenetreJeu zj,JRadioButton b1,JRadioButton b2,JRadioButton b3,JRadioButton b4,Joueur j,Partie p,Questions q){
        this.maQuestion=q;
        this.maFenetreJeu=zj;
        this.maPartie=p;
        this.monJoueur=j;
        this.monRadio1=b1;
        this.monRadio2=b2;
        this.monRadio3=b3;
        this.monRadio4=b4;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String reponse = this.maQuestion.getReponseCorrecte();
        String[] choix=this.maQuestion.getReponses();
        String repUtilisateur="";
                
        //vérifier quel radioButton est sélectionné
        if(this.monRadio1.isSelected()){
            repUtilisateur = choix[0];
        }
        if(this.monRadio2.isSelected()){
            repUtilisateur = choix[1];
        }
        if(this.monRadio3.isSelected()){
            repUtilisateur = choix[2];
        }
        if(this.monRadio4.isSelected()){
            repUtilisateur = choix[3];
        }

        if(reponse.equals(repUtilisateur)){
            this.maPartie.setScore();
            JOptionPane.showMessageDialog(null,"Bonne réponse !");
        }else{
            JOptionPane.showMessageDialog(null,"Mauvaise réponse, la réponse correcte était: "+reponse);
            //si c'est le 4e niveau la règle est différente: à la première erreur on à perdu, on affiche donc la fenêtre récapitulative
            if(this.maPartie.getNiveau()==4){
                new FenetreRecapitulative(this.maPartie,this.monJoueur);
                return;
            }
        }
        //l'utilisateur vient de répondre à une question, on passe à la question suivante
        this.maPartie.avanceQuestion();
        // s'il reste des questions, la partie n'est pas terminé, on raffraichit la page de jeu
        if(this.maPartie.getEnCours() >= this.maPartie.getNombreQuestions()==false){
            this.maFenetreJeu.maj();
        }
        //si la partie est fini on créer la fenetre récapitulative
        else{
            this.maFenetreJeu.setVisible(false);
            new FenetreRecapitulative(this.maPartie,this.monJoueur);
        }
    }
    
}
