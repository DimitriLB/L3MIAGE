/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;


import controleur.PartieRapide;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Joueur;

/**
 *
 * @author Menphis_Timrid
 */
public class ZonePartieRapide extends JPanel{
    
    private FenetrePrincipale maFenetrePrincipale;
    private Joueur monJoueur;
    
    public ZonePartieRapide(FenetrePrincipale f,  Joueur j){
        this.maFenetrePrincipale=f;
        this.monJoueur=j;
    }
    
    public JPanel buildPanel(){
        JPanel panel = new JPanel();
        
        JButton lancerPartie = new JButton(new PartieRapide(this.maFenetrePrincipale,this.monJoueur));
        lancerPartie.setText("Jouer");
        panel.add(lancerPartie);
        return panel;
    }
}
