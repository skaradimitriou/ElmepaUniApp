package com.stathis.elmepaunivapp.ui.department.model;

public class DepMembers extends Object {

    private String name;
    private Integer img;

    public DepMembers(String name, Integer img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}