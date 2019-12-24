package com.lut.student.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Student implements Serializable {
    @ApiModelProperty(value = "学号",required = true)
    private int id;


    private String name;


    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
