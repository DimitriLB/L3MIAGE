/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.LancerCampagne;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Joueur;

/**
 *
 * @author Menphis_Timrid
 */
public class ZoneCampagne extends JPanel{
    
    private FenetrePrincipale maFenetrePrincipale;
    private Joueur monJoueur;
    
    
    public ZoneCampagne(FenetrePrincipale f,Joueur j){
        this.monJoueur=j;
        this.maFenetrePrincipale=f;
    }

    public JPanel buildPanel() throws SQLException, ClassNotFoundException{
        JPanel panel = new JPanel(); 
        //on récupère le niveau du joueur pour savoir à quel niveau il peut accéder
        //System.out.println("niveau dans la campagne : "+this.monJoueur.getNiveau());
        int niveau = this.monJoueur.getNiveau();
        
        
        //on créer le bouton du premier niveau (tout le monde y a accès)
        JButton niveau1 = new JButton(new LancerCampagne(this.maFenetrePrincipale,this.monJoueur,1));
        niveau1.setText("niveau 1");
        panel.add(niveau1);
        
        //on créer maintenant les boutons en fonction du niveau atteint par le joueur
        if(niveau >= 1){
        JButton niveau2 = new JButton(new LancerCampagne(this.maFenetrePrincipale,this.monJoueur,2));
        niveau2.setText("niveau 2");
        panel.add(niveau2);
        }
        if(niveau >= 2){
        JButton niveau3 = new JButton(new LancerCampagne(this.maFenetrePrincipale,this.monJoueur,3));
        niveau3.setText("niveau 3");
        panel.add(niveau3);
        }
        if(niveau >= 3){
        JButton niveau4 = new JButton(new LancerCampagne(this.maFenetrePrincipale,this.monJoueur,4));
        niveau4.setText("niveau 4");
        panel.add(niveau4);
        }
        
        
        return panel;
        
    }
}

