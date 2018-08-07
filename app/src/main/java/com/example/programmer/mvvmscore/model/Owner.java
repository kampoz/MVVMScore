package com.example.programmer.mvvmscore.model;

/**
 * Created by Kamil on 2018-08-07.
 */
public class Owner {
    private String display_name;

    private String username;


    private Links links;

    private String uuid;

    private String type;

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClassPojo [display_name = " + display_name + ", username = " + username + ", links = " + links + ", uuid = " + uuid + ", type = " + type + "]";
    }
}