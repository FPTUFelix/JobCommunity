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
public class User {
    private int userID;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private String img;
    private String userType;
    private int numberOfFreePosts;
    private int isVerified;
    private String CCCDFront;
    private String CCCDBack;
    private String CCCDStatus;
    private int status;
    private Date createdAt;

    public User() {
    }

    public User(int userID, String userName, String password, String email, String fullName, String img, String userType, int numberOfFreePosts, int isVerified, String CCCDFront, String CCCDBack, String CCCDStatus, int status, Date createdAt) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.img = img;
        this.userType = userType;
        this.numberOfFreePosts = numberOfFreePosts;
        this.isVerified = isVerified;
        this.CCCDFront = CCCDFront;
        this.CCCDBack = CCCDBack;
        this.CCCDStatus = CCCDStatus;
        this.status = status;
        this.createdAt = createdAt;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getNumberOfFreePosts() {
        return numberOfFreePosts;
    }

    public void setNumberOfFreePosts(int numberOfFreePosts) {
        this.numberOfFreePosts = numberOfFreePosts;
    }

    public int getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(int isVerified) {
        this.isVerified = isVerified;
    }

    public String getCCCDFront() {
        return CCCDFront;
    }

    public void setCCCDFront(String CCCDFront) {
        this.CCCDFront = CCCDFront;
    }

    public String getCCCDBack() {
        return CCCDBack;
    }

    public void setCCCDBack(String CCCDBack) {
        this.CCCDBack = CCCDBack;
    }

    public String getCCCDStatus() {
        return CCCDStatus;
    }

    public void setCCCDStatus(String CCCDStatus) {
        this.CCCDStatus = CCCDStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    

    
}
