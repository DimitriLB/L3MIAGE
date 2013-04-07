/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Dao.ConnexionBDD;
import Dao.DBManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Menphis_Timrid
 */
public class Joueur {

    private String login;
    private String password;
    private int niveau;
    private int scoreMax;
    

    public Joueur(String l, String p) throws ClassNotFoundException, SQLException {
        this.login = l;
        this.password = p;
        
    }

    public Joueur(String l, String p, int n, int sm) {
        this.login = l;
        this.niveau = n;
        this.password = p;
        this.scoreMax = sm;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getScoreMax() {
        return scoreMax;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setScoreMax(int scoreMax) {
        this.scoreMax = scoreMax;
    }

    public boolean existe(String loginJoueur, String passwordJoueur) throws ClassNotFoundException, SQLException {
        ConnexionBDD Connexion = new ConnexionBDD();
        DBManager dbm = new DBManager(Connexion.getCo());
        return dbm.verifierUser(loginJoueur, passwordJoueur);
    }

    public Joueur RemplirJoueur(String loginJoueur, String passwordJoueur) throws ClassNotFoundException, SQLException {
        ConnexionBDD Connexion = new ConnexionBDD();
        DBManager dbm = new DBManager(Connexion.getCo());
        return dbm.getJoueur(loginJoueur, passwordJoueur);
    }
    public boolean insertJoueur(String login, String password) throws ClassNotFoundException, SQLException{
        ConnexionBDD Connexion = new ConnexionBDD();
        DBManager dbm = new DBManager(Connexion.getCo());
        return dbm.insertJoueur(login, password);
    }

    public boolean save(Joueur j) throws ClassNotFoundException, SQLException{
        ConnexionBDD Connexion = new ConnexionBDD();
        DBManager dbmm = new DBManager(Connexion.getCo());
        return dbmm.sauvegarder(j);
    }
}
