/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Post;
import Model.PostDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sontu
 */
public class DaoPost extends DBContext {

    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Connection connection = null;

    public List<Post> getPostInHomePage() {
        String sql = "SELECT TOP 9 * \n"
                + "FROM Post; \n";
        List<Post> l = new ArrayList<>();
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int postID = rs.getInt(1);
                int userID = rs.getInt(2);
                String title = rs.getString(3);
                String description = rs.getString(4);
                String img = rs.getString(5);
                String dateStarted = rs.getString(6);
                String timeDuration = rs.getString(7);
                String place = rs.getString(8);
                int salary = rs.getInt(9);
                String paymentTime = rs.getString(10);
                String requirements = rs.getString(11);
                int status = rs.getInt(12);
                Post p = new Post(postID, userID, title, description, img, dateStarted, timeDuration, place, salary, paymentTime, requirements, status);
                l.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;
    }

    public List<Post> getAllPost() {
        String sql = "SELECT * FROM Post WHERE Status = 1;";
        List<Post> l = new ArrayList<>();
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int postID = rs.getInt(1);
                int userID = rs.getInt(2);
                String title = rs.getString(3);
                String description = rs.getString(4);
                String img = rs.getString(5);
                String dateStarted = rs.getString(6);
                String timeDuration = rs.getString(7);
                String place = rs.getString(8);
                int salary = rs.getInt(9);
                String paymentTime = rs.getString(10);
                String requirements = rs.getString(11);
                int status = rs.getInt(12);
                Post p = new Post(postID, userID, title, description, img, dateStarted, timeDuration, place, salary, paymentTime, requirements, status);
                l.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;
    }

    public PostDetail getPostbyID(int postID) {
        PostDetail p = new PostDetail();
        String sql = "SELECT \n"
                + "    p.PostID, \n"
                + "    p.UserID, \n"
                + "    u.Username, \n"
                + "    p.Title, \n"
                + "    p.Description, \n"
                + "    p.Img, \n"
                + "    p.DateStarted, \n"
                + "    p.TimeDuration, \n"
                + "    p.Place, \n"
                + "    p.Salary, \n"
                + "    p.PaymentTime, \n"
                + "    p.Requirements\n"
                + "FROM Post p\n"
                + "JOIN [User] u ON p.UserID = u.UserID\n"
                + "where PostID = ?";
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            ps.setInt(1, postID);
            rs = ps.executeQuery();
            while (rs.next()) {
                int postiD = rs.getInt(1);
                int userID = rs.getInt(2);
                String userName = rs.getString(3);
                String title = rs.getString(4);
                String description = rs.getString(5);
                String img = rs.getString(6);
                String dateStarted = rs.getString(7);
                String timeDuration = rs.getString(8);
                String place = rs.getString(9);
                int salary = rs.getInt(10);
                String paymentTime = rs.getString(11);
                String requiremnts = rs.getString(12);
                p = new PostDetail(postiD, userID, userName, title, description, img, dateStarted, timeDuration, place, salary, paymentTime, requiremnts);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public boolean checkAvaliblePost(int userID) {
        String sql = "SELECT COUNT(*) AS PostCount \n"
                + "FROM Post \n"
                + "WHERE userID = ?;";
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            while (rs.next()) {
                int postCount = rs.getInt(1);
                if (postCount < 2) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void createNewPost(int userID, String title,String description ,String img, String dateStarted, String timeDuration, String place, int salary, String paymentTime, String requirements, int status) {
        String sql = "INSERT INTO Post (UserID, Title,Description, Img, DateStarted, TimeDuration, Place, Salary, PaymentTime, Requirements, Status)  \n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            connection = new DBContext().connection;
            ps = connection.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setString(2, title);
            ps.setString(3, description);
            ps.setString(4, img);
            ps.setString(5, dateStarted);
            ps.setString(6, timeDuration);
            ps.setString(7, place);
            ps.setInt(8, salary);
            ps.setString(9, paymentTime);
            ps.setString(10, requirements);
            ps.setInt(11, status);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DaoPost dao = new DaoPost();
        List<Post> l = dao.getAllPost();
        System.out.println(dao.checkAvaliblePost(1));
    }
}
