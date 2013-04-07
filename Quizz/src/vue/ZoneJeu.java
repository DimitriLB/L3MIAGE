/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.Fifty;
import controleur.Switcher;
import controleur.VerifierReponse;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Component;
import java.sql.Connection;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import model.Joueur;
import model.Partie;
import model.Questions;

/**
 *
 * @author Menphis_Timrid
 */
public class ZoneJeu extends JPanel {


    private Partie maPartie;
    private Questions maQuestion;
    private String[] reponses;
    private Joueur monJoueur;
    private FenetreJeu maFenetreJeu;

    public ZoneJeu(FenetreJeu fj, Joueur j, Partie p, Questions q) {
        this.maPartie = p;
        this.maQuestion = q;
        this.monJoueur = j;
        this.maFenetreJeu = fj;
    }

    public JPanel buildPanel(Questions q) {
        this.maQuestion=q;
        this.reponses = this.maQuestion.getReponses();
        //panel général
        JPanel panel = new JPanel();

        //panel question
        JPanel question = new JPanel();
        question.setLayout(new BoxLayout(question, BoxLayout.Y_AXIS));
        JLabel Lquestion = new JLabel();
        Lquestion.setText(this.maQuestion.getIntitule());
        question.add(Lquestion);

        //panel des réponses
        JPanel reponses = new JPanel();
        reponses.setLayout(new BoxLayout(reponses, BoxLayout.Y_AXIS));

        
         //l'utilisateur ne doit pouvoir coché qu'une seule réponse
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        //déclaration des labels de réponses (avec des radiobutons)
        
        JRadioButton c1Button = new JRadioButton(this.reponses[0]);
        if (!this.reponses[0].isEmpty()) {
            group.add(c1Button);
            reponses.add(c1Button);
        }
        JRadioButton c2Button = new JRadioButton(this.reponses[1]);
        if (!this.reponses[1].isEmpty()) {
            group.add(c2Button);
            reponses.add(c2Button);
        }
        JRadioButton c3Button = new JRadioButton(this.reponses[2]);
        if (!this.reponses[2].isEmpty()) {
            group.add(c3Button);
            reponses.add(c3Button);
        }
        JRadioButton c4Button = new JRadioButton(this.reponses[3]);
        if (!this.reponses[3].isEmpty()) {
            group.add(c4Button);
            reponses.add(c4Button);
        }

        //ajout des panels au panel principal
        panel.add(question,BorderLayout.NORTH);
        panel.add(reponses);


        //ajout des boutons de jokers
        JPanel jokerPanel = new JPanel();
        if (this.maPartie.getSwitcher()) {
            JButton switcher = new JButton(new Switcher(this.maPartie, this.maQuestion, this.maFenetreJeu));
            switcher.setText("Switcher la question");
            jokerPanel.add(switcher);
        }
        if(this.maPartie.getFiftyFifty()){
            JButton fifty = new JButton(new Fifty(this.maPartie, this.maQuestion, this.monJoueur, this.maFenetreJeu));
            fifty.setText("50 / 50");
            jokerPanel.add(fifty);
        }


        //ajout du bouton valider 
        JButton valider = new JButton(new VerifierReponse(this.maFenetreJeu, c1Button, c2Button, c3Button, c4Button, this.monJoueur, this.maPartie, this.maQuestion));

        valider.setText("valider");
        panel.add(valider);
        panel.add(jokerPanel);

        return panel;

    }
}
