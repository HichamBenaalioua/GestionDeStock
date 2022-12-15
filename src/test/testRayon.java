/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import entities.Rayon;
import services.RayonService;

/**
 *
 * @author macbook
 */
public class testRayon {
    public static void main(String[] args) {
        RayonService rs = new RayonService();
        
        rs.create(new Rayon("section1"));
        
        
    }
    
}
