package ru.netology.domain;

public class Vk {
    private int id;
    private int ownerId;
    private int date;
    private String text;
    private String imageURL;
    private Likesinfo likesinfo;
    private Commentsinfo commentsinfo;
    private Repostsinfo repostsinfo;
    private Viewsinfo viewsinfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }




}
