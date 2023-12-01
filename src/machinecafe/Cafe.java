/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinecafe;

/**
 *
 * @author entreprise
 */
public class Cafe {
    private String nom;
    private double prix;

    public Cafe(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    
    

    public String getNom() {
        return this.nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
