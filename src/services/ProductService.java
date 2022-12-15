/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import connexion.Connexion;
import dao.IDao;
import entities.Produit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ProductService implements IDao<Produit> {

    private CategoryService cs;
    private RayonService rs;

    public ProductService() {
        cs = new CategoryService();
        rs = new RayonService();

    }

    @Override
    public boolean create(Produit o) {
        try {
            String req = "insert into produit(name) values (?)";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getNomCategory());
            if (ps.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {

    }

    @Override
    public boolean update(Produit o) {

    }

    @Override
    public Produit findById(int id) {

    }

    @Override
    public List<Produit> findAll() {

    }

}
