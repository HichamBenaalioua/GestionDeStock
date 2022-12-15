/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author macbook
 */
public class Category {

    private int id;
    private String nomCategory;

    public Category(int id, String nomCategory) {
        this.id = id;
        this.nomCategory = nomCategory;
    }

    public Category(String nomCategory) {
        this.nomCategory = nomCategory;
    }

    public Category(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }

}
