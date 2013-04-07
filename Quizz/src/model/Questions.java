/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Menphis_Timrid
 */
public class Questions {
    
    private String intitule;
    private String[] reponses;
    private String reponsesCorrecte;
    
    
    public Questions(){
        
    }
    
    public Questions(String i, String[] rep, String correcte){
        this.intitule=i;
        this.reponses=rep;
        this.reponsesCorrecte=correcte;
    }

    public String getIntitule() {
        return intitule;
    }

    public String[] getReponses() {
        return reponses;
    }

    public String getReponseCorrecte() {
        return reponsesCorrecte;
    }
    
    public void setReponse(int i, String chaine){
        this.reponses[i]=chaine;
    }
    
    
    
    
    
}
