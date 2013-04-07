/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Dao.ConnexionBDD;
import Dao.DBManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Menphis_Timrid
 */
public class Partie {

    private ArrayList<Questions> mesQuestions = new ArrayList<>();
    private int niveau;
    private int nombreQuestions;
    private int score;
    private boolean partieRapide;
    private boolean switcher;
    private boolean fiftyfifty;
    private int enCours;

    public Partie() throws ClassNotFoundException, SQLException {
        this.score = 0;
        this.switcher = false;
        this.fiftyfifty = false;
        this.enCours=0;
    }

    public Partie(int n) throws ClassNotFoundException, SQLException {
        this.niveau = n;
        this.switcher = false;
        this.fiftyfifty = false;
        this.enCours=0;
    }

    public ArrayList<Questions> getMesQuestions() {
        return mesQuestions;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getNombreQuestions() {
        return nombreQuestions;
    }

    public boolean getFiftyFifty() {
        return this.fiftyfifty;
    }

    public boolean getSwitcher() {
        return this.switcher;
    }

    public int getScore() {
        return this.score;
    }
    
    public int getEnCours(){
        return this.enCours;
    }

    public boolean getPartieRapide() {
        return this.partieRapide;
    }

    public void setScore() {
        this.score = this.score + 1;
    }

    public void setNbQuestions(int n) {
        this.nombreQuestions = n;
    }

    public void setPartieRapide(boolean b) {
        this.partieRapide = b;
    }

    public void setFiftyFifty(boolean b) {
        this.fiftyfifty = b;
    }

    public void setSwitcher(boolean b) {
        this.switcher = b;
    }

    public void enleverPremiereQuestion() {
        this.mesQuestions.remove(0);
    }
    
    public void avanceQuestion(){
        this.enCours++;
    }
    

    //ajouter une question à la partie
    public void ajouterUneQuestion() throws SQLException, ClassNotFoundException {
        ConnexionBDD co = new ConnexionBDD();
        DBManager maBDD = new DBManager(co.getCo());
        //on appelle la méthode qui va nous apporter toutes les questions du niveau
        ArrayList<Questions> temp = maBDD.getQuestionNiveau(niveau);
        //on va mélanger les questions afin d'avoir un tirage au hasard
        Collections.shuffle(temp);
        //on va ajouter la question (si elle n'est pas contenue dans la bdd)
        int compteur=0;
        int ajout=0;
        while(compteur<1){
            if(!this.mesQuestions.contains(temp.get(ajout))){
                this.mesQuestions.add(temp.get(ajout));
                compteur++;
            }
            ajout++;            
        }
    }
    //remplie les questions de la partie n étant le nombre de questions à remplir pour le niveau prédéfinis

    public void remplirQuestions(int n) throws SQLException, ClassNotFoundException {
        ConnexionBDD co = new ConnexionBDD();
        DBManager maBDD = new DBManager(co.getCo());
        //on appelle la méthode qui va nous apporter toutes les questions du niveau
        ArrayList<Questions> temp = maBDD.getQuestionNiveau(niveau);
        //on va mélanger les questions afin d'avoir un tirage au hasard
        Collections.shuffle(temp);
        this.mesQuestions = temp;
        //on va limiter le nombre de questions
        int enlever = temp.size() - n;
        while (enlever > 0) {
            this.mesQuestions.remove(enlever);
            enlever--;
        }

    }

    //remplie la partie de toutes les questions contenues dans la BDD
    public void remplirQuestions() throws SQLException, ClassNotFoundException {
        ConnexionBDD co = new ConnexionBDD();
        DBManager maBDD = new DBManager(co.getCo());
        //on appelle la méthode qui va nous apporter toutes les questions du niveau
        this.mesQuestions = maBDD.getToutesQuestion();
        Collections.shuffle(mesQuestions);
    }

    public int nombreQuestionsTotal() throws ClassNotFoundException, SQLException {
        ConnexionBDD co = new ConnexionBDD();
        DBManager maBDD = new DBManager(co.getCo());
        return maBDD.nombreQuestions();
    }
}
