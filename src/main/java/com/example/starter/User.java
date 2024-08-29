package com.example.starter;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int custid;
    private String custname;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public void display() {
        System.out.println("Object Returned Successfully");
    }
}
