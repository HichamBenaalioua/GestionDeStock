/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import connexion.Connexion;
import dao.IDao;
import entities.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class CategoryService implements IDao<Category>{

    @Override
    public boolean create(Category o) {
                try {
            String req = "insert into categorie(name) values (?)";
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
    public boolean delete(Category o) {
        try {
            String req = "delete from categorie where id  = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, o.getId());
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
    public boolean update(Category o) {
        try {
            String req = "update categorie set name = ? where id = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(2, o.getId());
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
    public Category findById(int id) {
                Category category = null;
        try {
            String sql = "select * from categorie where id = " + id;
            Statement st = Connexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return new Category(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<Category>();
        try {
            String sql = "select * from categorie";
            Statement st = Connexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                categories.add(new Category(rs.getInt("id"),rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
    
}
