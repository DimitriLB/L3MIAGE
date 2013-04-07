/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.AbstractAction;
import vue.FenetreConnexion;
import vue.FenetreInscription;

/**
 *
 * @author Menphis_Timrid
 */
public class AfficheInscription extends AbstractAction{

    
    private FenetreConnexion maFenetre;
    
    public AfficheInscription(FenetreConnexion f){
        this.maFenetre=f;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.maFenetre.setVisible(false);
        new FenetreInscription();
    }
    
}
