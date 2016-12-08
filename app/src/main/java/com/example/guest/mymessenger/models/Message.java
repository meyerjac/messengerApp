package com.example.guest.mymessenger.models;

public class Message {
    private String user;
    private Long date;
    private String body;

    public Message(){}
    public Message(Long date, String body, String user) {
        this.date = date;
        this.body = body;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getBody() {
        return body;
    }

    public Long getDate() {
        return date;
    }
}
