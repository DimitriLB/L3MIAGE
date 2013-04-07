/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import Dao.ConnexionBDD;
import java.sql.SQLException;
import vue.FenetreConnexion;

/**
 *
 * @author Menphis_Timrid
 */
public class Quizz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        new FenetreConnexion();
    }
}
