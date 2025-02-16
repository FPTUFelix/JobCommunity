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
                + "FROM Post \n"
                + "ORDER BY CreatedAt DESC;";
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
                Date dateStarted = rs.getDate(6);
                String timeDuration = rs.getString(7);
                String place = rs.getString(8);
                int salary = rs.getInt(9);
                String paymentTime = rs.getString(10);
                String requirements = rs.getString(11);
                int status = rs.getInt(12);
                Date createdDate = rs.getDate(13);
                Post p = new Post(postID, userID, title, description, img, dateStarted, timeDuration, place, salary, paymentTime, requirements, status, createdDate);
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
                Date dateStarted = rs.getDate(6);
                String timeDuration = rs.getString(7);
                String place = rs.getString(8);
                int salary = rs.getInt(9);
                String paymentTime = rs.getString(10);
                String requirements = rs.getString(11);
                int status = rs.getInt(12);
                Date createdDate = rs.getDate(13);
                Post p = new Post(postID, userID, title, description, img, dateStarted, timeDuration, place, salary, paymentTime, requirements, status, createdDate);
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
                Date dateStarted = rs.getDate(7);
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

    public static void main(String[] args) {
        DaoPost dao = new DaoPost();
        List<Post> l = dao.getPostInHomePage();
        System.out.println(l.isEmpty());
    }
}
