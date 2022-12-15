/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author macbook
 */
public class Rayon {
   private int id;
   private String codeRayon;

    public Rayon(int id, String codeRayon) {
        this.id = id;
        this.codeRayon = codeRayon;
    }

    public Rayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }


    
}
