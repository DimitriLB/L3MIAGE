/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Joueur;
import model.Questions;

/**
 *
 * @author Menphis_Timrid
 */
public class DBManager {

    private String query;
    private ResultSet results;
    private Connection maConnexion;
    private Statement stmt;

    public DBManager(Connection co) throws SQLException {
        this.maConnexion = co;
        this.stmt = this.maConnexion.createStatement();
        //System.out.println(this.maConnexion);
    }

    //fonction qui vérifie si un user existe
    public boolean verifierUser(String loginJoueur, String passwordJoueur) {
        boolean resultat = false;
        String query = "SELECT * FROM APP.UTILISATEURS  WHERE login='" + loginJoueur + "' AND password='" + passwordJoueur + "'";
        ResultSet results;

        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            if (results.next()) {
                resultat = true;
            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return resultat;
    }

    //fonction qui retourne un joueur en fonction de son login et de son password
    public Joueur getJoueur(String loginJoueur, String passwordJoeur) {
        Joueur joueur = null;
        String query = "SELECT niveau, score_max FROM APP.UTILISATEURS  WHERE login='" + loginJoueur + "' AND password='" + passwordJoeur + "'";
        ResultSet results;

        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            if (results.next()) {
                int niveau = results.getInt(1);
                int score_max = results.getInt(2);
                joueur = new Joueur(loginJoueur, passwordJoeur, niveau, score_max);
            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return joueur;
    }

    //retourne le nombre de questions d'un certain niveau contenues dans la bdd
    public int nombreQuestions(int niveau) {
        int resultat = 0;
        this.query = "SELECT count(id) FROM APP.QUESTION  WHERE niveau=" + niveau + "";
        ResultSet results;
        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            if (results.next()) {
                resultat = results.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return resultat;
    }
    //retourne le nombre de questions au total contenues dans la bdd
    public int nombreQuestions() {
        int resultat = 0;
        this.query = "SELECT count(id) FROM APP.QUESTION";
        ResultSet results;
        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            if (results.next()) {
                resultat = results.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return resultat;
    }

    //retourne une question à partir de son id
    public Questions getQuestion(int id) {
        this.query = "SELECT intitule, choix1, choix2, choix3, choix4, reponse FROM APP.QUESTION  WHERE  id=" + id + "";
        ResultSet results;
        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            if (results.next()) {
                String intitule = results.getString(1);
                String[] reponses = {results.getString(2), results.getString(3), results.getString(4), results.getString(5)};
                String correcte = results.getString(6);
                Questions question = new Questions(intitule, reponses, correcte);
                return question;

            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return null;
    }
    
    //retourne les questions d'un niveau
    public ArrayList<Questions> getQuestionNiveau(int niveau) {
        ArrayList<Questions> mesQuestions = new ArrayList<>();
        this.query = "SELECT intitule, choix1, choix2, choix3, choix4, reponse FROM APP.QUESTION  WHERE  niveau=" + niveau + "";
        ResultSet results;
        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            while (results.next()) {
                String intitule = results.getString(1);
                String[] reponses = {results.getString(2), results.getString(3), results.getString(4), results.getString(5)};
                String correcte = results.getString(6);
                Questions question = new Questions(intitule, reponses, correcte);
                mesQuestions.add(question);
                
            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return mesQuestions;
    }
    
    //retourne toutes les questions de la BDD
    public ArrayList<Questions> getToutesQuestion() {
        ArrayList<Questions> mesQuestions = new ArrayList<>();
        this.query = "SELECT intitule, choix1, choix2, choix3, choix4, reponse FROM APP.QUESTION  ";
        ResultSet results;
        try {
            Statement stmt = this.maConnexion.createStatement();
            results = stmt.executeQuery(query);
            while (results.next()) {
                String intitule = results.getString(1);
                String[] reponses = {results.getString(2), results.getString(3), results.getString(4), results.getString(5)};
                String correcte = results.getString(6);
                Questions question = new Questions(intitule, reponses, correcte);
                mesQuestions.add(question);
                
            }
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return mesQuestions;
    }
    
    //inscription d'un joueur dans la BDD
    public boolean insertJoueur(String login, String pass) {
        boolean resultat = false;
        this.query = "INSERT INTO APP.UTILISATEURS(login,password,niveau,score_max) values('" + login + "','" + pass + "',0,0)";
        try {
            Statement stmt = this.maConnexion.createStatement();
            stmt.executeUpdate(query);
            resultat = true;
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }

        return resultat;
    }

    //sauvegarde d'un joueur (niveau et score) dans la bdd
    public boolean sauvegarder(Joueur j) {
        boolean resultat = false;
        int niveau=j.getNiveau();
        int score=j.getScoreMax();
        this.query ="UPDATE APP.UTILISATEURS set niveau="+niveau+", score_max="+score+"";
        try {
            Statement stmt = this.maConnexion.createStatement();
            stmt.executeUpdate(query);
            resultat = true;
        } catch (SQLException ex) {
            System.out.println("Exception du a la requete");
            ex.printStackTrace();
        }
        return resultat;
    }
}
