/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.sql.Connection;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Joueur;
import model.Partie;

/**
 *
 * @author Menphis_Timrid
 */
public class FenetreJeu extends JFrame{
   
    
    private Partie maPartie;
    private Joueur monJoueur;
    private JPanel monPanelDefaut =  new JPanel();
    private ZoneJeu maZoneJeu;
    
    
    public FenetreJeu(Joueur j, Partie p){
        super();
        this.maPartie=p;
        this.monJoueur=j;
        build();
    }
    
    private void build(){
        setTitle("Jeu");
        setSize(700,400);
        setLocationRelativeTo(null);
        setResizable(true);
        this.maZoneJeu = new ZoneJeu(this,this.monJoueur,this.maPartie,this.maPartie.getMesQuestions().get(this.maPartie.getEnCours()));
        setContentPane(this.monPanelDefaut);
        this.monPanelDefaut.add(maZoneJeu.buildPanel(this.maPartie.getMesQuestions().get(this.maPartie.getEnCours())));
        setVisible(true);
        
    }
    
    public void maj(){
        this.monPanelDefaut.removeAll();
        this.monPanelDefaut.add(this.maZoneJeu.buildPanel(this.maPartie.getMesQuestions().get(this.maPartie.getEnCours()))); 
        this.monPanelDefaut.validate();
        this.monPanelDefaut.repaint();
    }
}
