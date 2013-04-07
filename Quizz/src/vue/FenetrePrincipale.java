/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Joueur;

/**
 *
 * @author Menphis_Timrid
 */
public class FenetrePrincipale extends JFrame{
    
    private Joueur monJoueur; 
    private JPanel panelDefault= new JPanel();
     
    
    public FenetrePrincipale(Joueur j) throws SQLException, ClassNotFoundException{
        super();
        this.monJoueur=j;
        this.build();
    }
    
    /**
     *Construction de la fenêtre, on définit ses propriétés
     */
    private void build() throws SQLException, ClassNotFoundException{
        //System.out.println("niveau="+this.monJoueur.getNiveau());
        setTitle("FenetrePrincipale");
        setSize(700,600);
        setLocationRelativeTo(null);
        setResizable(true);
        //fermeture du programme lors de la fermeture de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ZoneCampagne campagne = new ZoneCampagne(this,this.monJoueur);
        ZonePartieRapide partieRapide = new ZonePartieRapide(this,this.monJoueur);   
        ZoneSauvegarde sauvegarde = new ZoneSauvegarde(this.monJoueur);
        //Création d'un panel qui va servir par défaut
        this.panelDefault.setLayout(new BorderLayout());
        this.setContentPane(this.panelDefault);
        this.panelDefault.add(campagne.buildPanel(),BorderLayout.WEST);
        this.panelDefault.add(partieRapide.buildPanel(),BorderLayout.EAST);
        this.panelDefault.add(sauvegarde.buildPanel(),BorderLayout.SOUTH);
//        this.panelDefault.add(this.zoneStatistique.buildPanel(),BorderLayout.SOUTH);        
        setVisible(true);
        
    }
    
}
