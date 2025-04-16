////package com.bridgelabz.greetingapp.model;
////
////import jakarta.persistence.Entity;
////import jakarta.persistence.Id;
////
////@Entity
////public class User {
////    @Id
////    private Long id;
////
////    public void setFirstName(String name) {
////    }
////}
//
//package com.bridgelabz.greetingapp.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String firstName;
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String name) {
//        this.firstName = name;
//    }
//    @Override
//    public String toString() {
//        return this.firstName;
//    }
//}
//
//
//
//
//

package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String userId;
    private String firstName;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName;
    }
}