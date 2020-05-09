package ru.netology.domain;

public class Vk {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwwnerId;
    private int replyPostId;
    private int friendsOnly;
    private Commentsinfo commentsinfo;
    private String copyright;
    private Likesinfo likesinfo;
    private Repostsinfo repostsinfo;
    private Viewsinfo viewsinfo;
    private String postType;
    private Postsourse postsourse;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwwnerId() {
        return replyOwwnerId;
    }

    public void setReplyOwwnerId(int replyOwwnerId) {
        this.replyOwwnerId = replyOwwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public Commentsinfo getCommentsinfo() {
        return commentsinfo;
    }

    public void setCommentsinfo(Commentsinfo commentsinfo) {
        this.commentsinfo = commentsinfo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Likesinfo getLikesinfo() {
        return likesinfo;
    }

    public void setLikesinfo(Likesinfo likesinfo) {
        this.likesinfo = likesinfo;
    }

    public Repostsinfo getRepostsinfo() {
        return repostsinfo;
    }

    public void setRepostsinfo(Repostsinfo repostsinfo) {
        this.repostsinfo = repostsinfo;
    }

    public Viewsinfo getViewsinfo() {
        return viewsinfo;
    }

    public void setViewsinfo(Viewsinfo viewsinfo) {
        this.viewsinfo = viewsinfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Postsourse getPostsourse() {
        return postsourse;
    }

    public void setPostsourse(Postsourse postsourse) {
        this.postsourse = postsourse;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public Vk() {
    }

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


}
