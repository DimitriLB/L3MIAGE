/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.VerifierConnexion;
import controleur.retourMenu;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Joueur;
import model.Partie;

/**
 *
 * @author Menphis_Timrid
 */
public class FenetreRecapitulative extends JFrame {

    private Partie maPartie;
    private Joueur monJoueur;

    public FenetreRecapitulative(Partie p, Joueur j) {
        super();
        this.maPartie = p;
        this.monJoueur = j;

        build();
    }

    public void build() {
        setTitle("Recapitulatif");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPanel());
        setVisible(true);
    }

    public JPanel buildContentPanel() {
        //System.out.println(this.maConnexion);
        JPanel panel = new JPanel();
        JLabel reponses = new JLabel();
        reponses.setText("score : " + this.maPartie.getScore() + " / " + this.maPartie.getNombreQuestions() + " questions");
        panel.add(reponses);
        double ratioNb = ((double) this.maPartie.getScore() / (double) this.maPartie.getNombreQuestions()) * 100;
        JLabel ratio = new JLabel();
        ratio.setText("ratio:" + ratioNb);
        panel.add(ratio);
        if (this.maPartie.getPartieRapide() == false && ratioNb >= 70) {
            this.monJoueur.setNiveau(this.monJoueur.getNiveau() + 1);
            JOptionPane.showMessageDialog(null, "Félicitations, vous avez réussi le niveau" + this.maPartie.getNiveau() + ", essayez le suivant");
        }
        if(this.maPartie.getNiveau()==4 && this.monJoueur.getScoreMax()<this.maPartie.getScore()){
            this.monJoueur.setScoreMax(this.maPartie.getScore());
        }
        JButton retour = new JButton(new retourMenu(this, this.monJoueur));
        retour.setText("retour menu");
        panel.add(retour);
        return panel;
    }
}
