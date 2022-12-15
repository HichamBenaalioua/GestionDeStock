/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import connexion.Connexion;
import dao.IDao;
import entities.Category;
import entities.Rayon;
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
public class RayonService implements IDao<Rayon>{

    @Override
    public boolean create(Rayon o) {
            try {
            String req = "insert into rayon(codeRayon) values (?)";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getCodeRayon());
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
    public boolean delete(Rayon o) {
            try {
            String req = "delete from rayon where id  = ?";
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
    public boolean update(Rayon o) {
            try {
            String req = "update rayon set codeRayon = ? where id = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(2, o.getId());
            ps.setString(1,o.getCodeRayon());
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
    public Rayon findById(int id) {
                        Rayon rayon = null;
        try {
            String sql = "select * from rayon where id = " + id;
            Statement st = Connexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return new Rayon(rs.getInt("id"), rs.getString("codeRayon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    }

    @Override
    public List<Rayon> findAll() {
                List<Rayon> rayons = new ArrayList<Rayon>();
        try {
            String sql = "select * from rayon";
            Statement st = Connexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                rayons.add(new Rayon(rs.getInt("id"),rs.getString("codeRayon")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rayons;
    }
    
}
