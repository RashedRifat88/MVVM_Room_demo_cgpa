package com.example.mvvm_room_demo_cgpa;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Semister {

    @PrimaryKey(autoGenerate = true)
    int id;
    double semister_cgpa;
    double semister_credit;
    String semister_name;

    public Semister(double semister_cgpa, double semister_credit, String semister_name) {
        this.semister_cgpa = semister_cgpa;
        this.semister_credit = semister_credit;
        this.semister_name = semister_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSemister_cgpa() {
        return semister_cgpa;
    }

    public void setSemister_cgpa(double semister_cgpa) {
        this.semister_cgpa = semister_cgpa;
    }

    public double getSemister_credit() {
        return semister_credit;
    }

    public void setSemister_credit(double semister_credit) {
        this.semister_credit = semister_credit;
    }

    public String getSemister_name() {
        return semister_name;
    }

    public void setSemister_name(String semister_name) {
        this.semister_name = semister_name;
    }
}
