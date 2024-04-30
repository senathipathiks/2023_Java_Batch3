package com.practice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin") // Define the table name in the database
public class Admin {

    @Id
    private Long id;

    private String username = "Admin";
    private String password = "Admin@123";

     
}
