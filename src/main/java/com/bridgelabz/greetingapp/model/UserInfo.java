package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class UserInfo {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
