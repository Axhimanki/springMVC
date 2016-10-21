package com.example.domain;

import java.util.Date;

/**
 * Created by Armando on 10/21/2016.
 */
public class Post {
    private Date date;
    private Integer postID; //for generic arguments List<T>, for absence of a null value,
    private String text;
    private String respondEmail;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRespondEmail() {
        return respondEmail;
    }

    public void setRespondEmail(String respondEmail) {
        this.respondEmail = respondEmail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }




}
