/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import entities.Category;
import services.CategoryService;

/**
 *
 * @author macbook
 */
public class testCategory {
    public static void main(String[] args) {
        CategoryService cs = new CategoryService();
        cs.create(new Category("informatique"));
    }
}
