/*F
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Menphis_Timrid
 */
public class ConnexionBDD {

    private String driver = "org.apache.derby.jdbc.ClientDriver";
    private String bdd = "jdbc:derby://localhost:1527/QuizzDB";
    private String login = "dimitri";
    private String pass = "dimitri";
    private Connection maConnexion ;

    public ConnexionBDD() throws ClassNotFoundException, SQLException {

//Charge le pilote
        this.loadDriver();
//Crée la connection
        maConnexion = this.connectBDD();

    }
    
    public String getDriver() {
        return driver;
    }

    public String getBdd() {
        return bdd;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public Connection getCo() {
        return maConnexion;
    }

    
    public void loadDriver() throws ClassNotFoundException {
        Class.forName(driver);
        System.out.println("Chargement du driver...");

    }

    public Connection connectBDD() throws SQLException {
        Connection cotemp;
        cotemp = DriverManager.getConnection(bdd, login, pass);
        System.out.println("Connection à la BDD");
        return cotemp;
    }
}
