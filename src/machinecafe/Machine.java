/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinecafe;

import java.util.ArrayList;

/**
 *
 * @author entreprise
 */
public class Machine {
    private String nom;
    private ArrayList<Cafe> lesCafes  = new ArrayList<Cafe>();

    public Machine(String nom) {
        this.nom = nom;
    }
    
    
    public int getNbCafe(){
        return this.lesCafes.size();
    }
    
    public void afficheNbCafe(){
        System.out.println("Les nombres de café acheter sont: " + this.getNbCafe());
    }
    public double getPrixTotalCafe(){
        double PrixTotal = 0;
            for(Cafe c : this.lesCafes){
                PrixTotal = PrixTotal + c.getPrix();  
            }
            return Math.round(PrixTotal * 100.0)/100.0;
    }
    public void affichePrixTotalCafe(){
        System.out.println("Le prix total cafe est de : " + this.getPrixTotalCafe());
    }
    
    public void commande (Cafe cafe){
        this.lesCafes.add(cafe);
    }
    public void reintialiser(){
        this.lesCafes.clear();
    }
}