/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author macbook
 */
public class Produit {
   private int id;
   private String designation;
   private double prixAchat;
   private Rayon rayon;
   private Category category;
   private double tauxTVA;

    public Produit(int id, String designation, double prixAchat, Rayon rayon, Category category, double tauxTVA) {
        this.id = id;
        this.designation = designation;
        this.prixAchat = prixAchat;
        this.rayon = rayon;
        this.category = category;
        this.tauxTVA = tauxTVA;
    }

    public Produit(String designation, double prixAchat, Rayon rayon, Category category, double tauxTVA) {
        this.designation = designation;
        this.prixAchat = prixAchat;
        this.rayon = rayon;
        this.category = category;
        this.tauxTVA = tauxTVA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }
   
    
}
