package com.kanyideveloper.recyclerview;

import android.graphics.drawable.Drawable;

public class Chats {

    private int chatsImage;
    private String chatTitle;
    private String message;

    public Chats(int chatsImage, String chatTitle, String message) {
        this.chatsImage = chatsImage;
        this.chatTitle = chatTitle;
        this.message = message;
    }

    public int getChatsImage() {
        return chatsImage;
    }

    public void setChatsImage(int chatsImage) {
        this.chatsImage = chatsImage;
    }

    public String getChatTitle() {
        return chatTitle;
    }

    public void setChatTitle(String chatTitle) {
        this.chatTitle = chatTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
