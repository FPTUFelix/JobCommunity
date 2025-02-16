/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author sontu
 */
public class DaoUser extends DBContext {

    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Connection connection = null;

    public User getUserName(String userName) {
        String sql = "select *from [User]\n"
                + "where Username = ?";
        User u = new User();
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt(1);
                String userNAme = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);
                String fullName = rs.getString(5);
                String img = rs.getString(6);
                String userType = rs.getString(7);
                int numberFreePosts = rs.getInt(8);
                int isVerifired = rs.getInt(9);
                String CCCDFront = rs.getString(10);
                String CCCDBack = rs.getString(11);
                String CCCDStatus = rs.getString(12);
                int status = rs.getInt(13);
                Date createdDate = rs.getDate(14);
                u = new User(userID, userNAme, password, email, fullName, img, userType, numberFreePosts, isVerifired, CCCDFront, CCCDBack, CCCDStatus, status, createdDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    public User getUserbyID(int userID) {
        User u = new User();
        String sql = "select *from [User]\n"
                + "where UserID = ?";
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            while (rs.next()) {
                int useriD = rs.getInt(1);
                String userNAme = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);
                String fullName = rs.getString(5);
                String img = rs.getString(6);
                String userType = rs.getString(7);
                int numberFreePosts = rs.getInt(8);
                int isVerifired = rs.getInt(9);
                String CCCDFront = rs.getString(10);
                String CCCDBack = rs.getString(11);
                String CCCDStatus = rs.getString(12);
                int status = rs.getInt(13);
                Date createdDate = rs.getDate(14);
                u = new User(userID, userNAme, password, email, fullName, img, userType, numberFreePosts, isVerifired, CCCDFront, CCCDBack, CCCDStatus, status, createdDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    public void changeAvatarForUser(int userID, String img) {
        String sql = "UPDATE [User]\n"
                + "SET Img = ?\n"
                + "WHERE UserID = ?;";
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            ps.setString(1, img);
            ps.setInt(2, userID);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DaoUser d = new DaoUser();
        d.changeAvatarForUser(1, "a");
    }
}
