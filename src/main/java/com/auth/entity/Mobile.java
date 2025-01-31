package com.auth.entity;

import jakarta.persistence.*;

@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobid;

    private String mobileName;

//    @OneToOne
//    private Emp emp;

    @OneToOne
    Pen pen;

//    public Emp getEmp() {
//        return emp;
//    }
//
//    public void setEmp(Emp emp) {
//        this.emp = emp;
//    }

    public int getId() {
        return mobid;
    }

    public void setId(int id) {
        this.mobid = id;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
