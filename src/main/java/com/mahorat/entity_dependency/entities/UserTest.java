package com.mahorat.entity_dependency.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user_test")
public class UserTest {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    String fullName;

    @Column(unique = true, nullable = false)
    String email;

    int status;
}
