package com.vrx.SpringMvcProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private String branch;
    private String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // If we want to include json while consuming: use @JsonProperty at setter
    // If we want to exclude json while producing : use @JsonIgnore at getter
    // Vice-Versa
//    @JsonIgnore
    @JsonProperty
    public String getBranch() {
        return branch;
    }

//    @JsonProperty
    @JsonIgnore
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
