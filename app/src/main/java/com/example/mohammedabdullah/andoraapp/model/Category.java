package com.example.mohammedabdullah.andoraapp.model;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("category")
    String name;

    public Category(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
