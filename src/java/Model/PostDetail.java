/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author sontu
 */
public class PostDetail {
    private int postID;
    private int userID;
    private String userName;
    private String title;
    private String Description;
    private String img;
    private Date startedDate;
    private String timeDuration;
    private String place;
    private int salary;
    private String paymentTime;
    private String requirements;

    public PostDetail() {
    }

    public PostDetail(int postID, int userID, String userName, String title, String Description, String img, Date startedDate, String timeDuration, String place, int salary, String paymentTime, String requirements) {
        this.postID = postID;
        this.userID = userID;
        this.userName = userName;
        this.title = title;
        this.Description = Description;
        this.img = img;
        this.startedDate = startedDate;
        this.timeDuration = timeDuration;
        this.place = place;
        this.salary = salary;
        this.paymentTime = paymentTime;
        this.requirements = requirements;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public String getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
    
}
