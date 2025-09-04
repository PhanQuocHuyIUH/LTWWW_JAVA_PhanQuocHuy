package iuh.fit.se.m16_22714321_phanquochuy_tuan03_bai1;

import lombok.Data;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String mobileNumber;
    private String gender; // F: male, T: female
    private String address;
    private String city;
    private String pinCode;
    private String state;
    private String country;
    private String hobbies;
    private String course;
}
