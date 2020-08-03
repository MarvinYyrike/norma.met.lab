package com.norma.met.lab.entity;

import javax.persistence.*;

@Entity
@Table(name ="order_file")
public class OrderFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Object orderFile;

    public OrderFile(){

    }

    public OrderFile(int id, Object orderFile) {
        this.id = id;
        this.orderFile = orderFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getOrderFile() {
        return orderFile;
    }

    public void setOrderFile(Object orderFile) {
        this.orderFile = orderFile;
    }
}
