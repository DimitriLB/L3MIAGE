/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.Sauvegarde;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Joueur;

/**
 *
 * @author Menphis_Timrid
 */
public class ZoneSauvegarde extends JPanel{
    
    
    private Joueur monJoueur;
    
    public ZoneSauvegarde(Joueur j){
        this.monJoueur=j;
    }
    
    public JPanel buildPanel(){
        JPanel panel= new JPanel();
        JButton sauver= new JButton(new Sauvegarde(this.monJoueur));
        sauver.setText("sauvegarder");
        panel.add(sauver);
        return panel;
    }
}
