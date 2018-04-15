package com.example.root.csvfile;

public class Userdata {

    private int id;
    private  String name;
    private  int contactno;
    private  String address;

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

    public int getContactno() {
        return contactno;
    }

    public void setContactno(int contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Userdata{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactno=" + contactno +
                ", address='" + address + '\'' +
                '}';
    }
}