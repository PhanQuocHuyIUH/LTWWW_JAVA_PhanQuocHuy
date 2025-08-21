package fit.iuh.se.m07_22714321_phanquochuy_tuan01.bai3bai4bai5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
    private String username;
    private String password;
    private String email;
    private int age;
    private String phone;

    public User(String username, String password, String email, int age, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String toJson()
    {
        ObjectMapper om = new ObjectMapper();
        String jsonStr;
        try {
            jsonStr = om.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jsonStr;
    }

    public static User toUser(String jsonStr)
    {
        ObjectMapper om = new ObjectMapper();
        try {
            return om.readValue(jsonStr, User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
