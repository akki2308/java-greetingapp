////package com.bridgelabz.greetingapp.model;
////
////import jakarta.persistence.Entity;
////import jakarta.persistence.Id;
////
////@Entity
////public class Greeting {
////    @Id
////    private Long l;
////    private String message;
////
////    public Greeting(Long l, String message) {
////        this.l = l;
////        this.message = message;
////    }
////
////    public Greeting(long l, String message) {
////
////    }
////}
////
////
////
//
//package com.bridgelabz.greetingapp.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Greeting {
//    @Id
//    private Long l;
//    private String message;
//
//    // ✅ Default constructor required by JPA
//    public Greeting() {
//    }
//
//    // ✅ Constructor to set fields
//    public Greeting(Long l, String message) {
//        this.l = l;
//        this.message = message;
//    }
//
//    // ✅ Getters and Setters
//    public Long getL() {
//        return l;
//    }
//
//    public void setL(Long l) {
//        this.l = l;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//}

package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Greeting {
    @Id
    private long id;
    private String message;

    public Greeting(){}
    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}